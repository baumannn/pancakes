package main.parser.compiler;

import main.parser.generated.PancakesBaseListener;
import main.parser.symbolTable.ArraySymbol;
import main.parser.symbolTable.GlobalScope;
import main.parser.symbolTable.Symbol;
import main.parser.symbolTable.VariableSymbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by adrian on 11/25/15.
 */
public class TranslationSecondPhase extends PancakesBaseListener {

    private GlobalScope globalScope;
    private ArrayList<Integer> mfo;
    private int ip;
    private HashMap<Symbol, Integer> varReferences;

    public TranslationSecondPhase(GlobalScope globalScope, ArrayList<Integer> mfo, int ip) {
        this.globalScope = globalScope;
        this.mfo = mfo;
        this.ip = ip;
        varReferences = new HashMap<>();

        Map<String, Symbol> symbols = globalScope.getSymbols();

        for (String s : symbols.keySet()) {

            Symbol sym = symbols.get(s);
            if(sym instanceof VariableSymbol){
                VariableSymbol vs = (VariableSymbol) sym;
                varReferences.put(vs, ip);
                vs.setAddress(ip);
                mfo.add(new Integer(0));
                this.ip++;
            } else if(sym instanceof ArraySymbol){
                ArraySymbol as = (ArraySymbol) sym;
                varReferences.put(as, ip);
                as.setAddress(ip);

                int size = as.getTotalSize();

                System.out.println("aaaaa " + as.getTotalSize());

                for (int i = 0; i < size; i++) {
                    mfo.add(new Integer(0));
                    this.ip++;
                }

            }

        }


    }


    public ArrayList<Integer> getMfo() {
        return mfo;
    }

    public void setMfo(ArrayList<Integer> mfo) {
        this.mfo = mfo;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public HashMap<Symbol, Integer> getReferences() {
        return varReferences;
    }

    public void setVarReferences(HashMap<Symbol, Integer> varReferences) {
        this.varReferences = varReferences;
    }
}
