package main.parser.symbolTable;

import main.parser.PancakesParser;

/**
 * Created by adrian on 11/2/15.
 */
public class SymbolTable implements Scope{


    public SymbolTable() {
        globalScope = new GlobalScope();

//        globalScope.define(new BuiltInTypeSymbol("int"));
//        globalScope.define(new BuiltInTypeSymbol("float"));
//        globalScope.define(new BuiltInTypeSymbol("bool"));
//        globalScope.define(new BuiltInTypeSymbol("string"));
        globalScope.define(new BuiltInTypeSymbol("bivar"));





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

    }

    @Override
    public Symbol resolve(String name) {
        return null;
    }
}
