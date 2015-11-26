package main.parser.compiler;

import main.parser.generated.PancakesBaseListener;
import main.parser.generated.PancakesParser;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by adrian on 11/25/15.
 */
public class TranslationFirstPhase extends PancakesBaseListener {

    private HashMap<String, Integer> fConstants;
    private HashMap<String, Integer> sConstants;
    private int ip = 0;

    ArrayList<Integer> mfo;


    public TranslationFirstPhase() {
        fConstants = new HashMap<>();
        sConstants = new HashMap<>();
        mfo = new ArrayList<>();

        mfo.add(OpCode.GOTO);
        ip++;

        mfo.add(new Integer(0));
        ip++;

    }


    @Override
    public void exitFloatConst(PancakesParser.FloatConstContext ctx) {
        fConstants.put(ctx.FLOAT().getSymbol().getText(), ip);

        byte[] b = ByteBuffer.allocate(4).putFloat( new Float(ctx.FLOAT().getSymbol().getText())).array();
        int floatAsInt = ByteBuffer.wrap(b).getInt();
        mfo.add(floatAsInt);

        ip++;
    }

    @Override
    public void exitStringConst(PancakesParser.StringConstContext ctx) {

        String sconst = ctx.STRING().getSymbol().getText();
        sconst = sconst.replace("\"", "");
        System.out.println("String " + sconst);
        sConstants.put(sconst, ip);

        mfo.add(sconst.length());
        ip++;
        for (int i = 0; i < sconst.length(); i++) {
            mfo.add((int) sconst.charAt(i));
            ip++;
        }

//        byte[] b = ctx.STRING().getSymbol().getText().getBytes();
//
//        mfo.add(new Integer(b.length).byteValue());
//
//        for (int i = 0; i < b.length; i++) {
//            mfo.add(b[i]);
//        }
//        ip+=b.length;
    }

    public HashMap<String, Integer> getfConstants() {
        return fConstants;
    }

    public HashMap<String, Integer> getsConstants() {
        return sConstants;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public ArrayList<Integer> getMfo() {
        return mfo;
    }
}
