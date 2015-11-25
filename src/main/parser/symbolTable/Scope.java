package main.parser.symbolTable;

/**
 * Created by adrian on 11/2/15.
 */
public interface Scope {
    public String getScopeName();
    public Scope getEnclosingScope();
    public void define(Symbol sym);
    public Symbol resolve(String name);
    public boolean isDefined(Symbol sym);
}
