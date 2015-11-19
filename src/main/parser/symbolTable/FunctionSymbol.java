package main.parser.symbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * baumann -- 11/6/15.
 */
public class FunctionSymbol extends Symbol implements Scope {

    private Map<String, Symbol> args = new LinkedHashMap<>();
    private Scope enclosingScope;


    public FunctionSymbol(String name, Type retType, Scope enclosingScope) {
        super(name, retType);
        this.enclosingScope = enclosingScope;

    }

    @Override
    public Symbol resolve(String name) {
        Symbol symbol = args.get(name);
        if(symbol!= null){
            return symbol;
        } else if(getEnclosingScope() != null) {

            return getEnclosingScope().resolve(name);

        } else {
            return null;
        }
    }

    @Override
    public void define(Symbol symbol) {

        symbol.setScope(this);
        args.put(symbol.getName(), symbol);

    }

    @Override
    public boolean isDefined(Symbol sym) {
        return args.containsKey(sym.getName());
    }

    @Override
    public String getScopeName() {
        return super.getName();
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }


}
