package main.parser.symbolTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adrian on 11/2/15.
 */
public abstract class BaseScope implements Scope {

    private Scope enclosingScope;
    private Map<String,Symbol> symbols = new HashMap<>();
    private int offset;

    public BaseScope(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public void define(Symbol symbol) {

        symbol.setScope(this);
        symbols.put(symbol.getName(),symbol);

    }

    @Override
    public Symbol resolve(String name) {


        Symbol symbol = symbols.get(name);
        if(symbol != null) {
            return symbol;
        } else if(enclosingScope!= null) {
            return enclosingScope.resolve(name);
        } else {
            return null;
        }
    }

    @Override
    public boolean isDefined(Symbol sym) {
        return symbols.containsKey(sym.getName());
    }

    public Map<String, Symbol> getSymbols() {
        return symbols;
    }
}
