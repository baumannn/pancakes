package main.parser.compiler;

import main.parser.generated.PancakesBaseListener;
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
            if(symbols.get(s) instanceof VariableSymbol){
                VariableSymbol vs = (VariableSymbol) symbols.get(s);
                varReferences.put(vs, ip);
                vs.setAddress(ip);
                mfo.add(new Integer(0));
                this.ip++;
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

    public HashMap<Symbol, Integer> getVarReferences() {
        return varReferences;
    }

    public void setVarReferences(HashMap<Symbol, Integer> varReferences) {
        this.varReferences = varReferences;
    }
}
