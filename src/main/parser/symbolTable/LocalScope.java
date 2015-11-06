package main.parser.symbolTable;

/**
 * Created by adrian on 11/2/15.
 */
public class LocalScope extends BaseScope {

    public LocalScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    @Override
    public String getScopeName() {
        return "local";
    }
}
