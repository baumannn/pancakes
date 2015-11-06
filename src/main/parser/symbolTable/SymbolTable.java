package main.parser.symbolTable;

import main.parser.PancakesParser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adrian on 11/2/15.
 */
public class SymbolTable implements Scope{


    Map<String,Symbol> globalScope = new HashMap<>();




    public SymbolTable() {
        initTypeSystem();
    }

    protected void initTypeSystem(){

        define(new BuiltInTypeSymbol("int"));
        define(new BuiltInTypeSymbol("float"));
        define(new BuiltInTypeSymbol("bool"));
        define(new BuiltInTypeSymbol("string"));


    }


    @Override
    public String getScopeName() {
        return "global";
    }

    @Override
    public Scope getEnclosingScope() {
        return null;
    }

    @Override
    public void define(Symbol sym) {
        globalScope.put(sym.name, sym);
    }

    @Override
    public Symbol resolve(String name) {
        return globalScope.get(name);
    }

    @Override
    public String toString() {
        return getScopeName() + ":" + globalScope;
    }
}
