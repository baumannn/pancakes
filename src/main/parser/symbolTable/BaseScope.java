package main.parser.symbolTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adrian on 11/2/15.
 */
public abstract class BaseScope implements Scope {

    Scope enclosingScope;
    Map<String,Symbol> symbols = new HashMap<>();

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
}
