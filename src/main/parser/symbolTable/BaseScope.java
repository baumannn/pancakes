package main.parser.symbolTable;

/**
 * Created by adrian on 11/2/15.
 */
public class BaseScope implements Scope {
    @Override
    public String getScopeName() {
        return null;
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
