package main.parser.symbolTable;

/**
 * Created by adrian on 11/2/15.
 */
public class LocalScope extends BaseScope {

    int offset = 0;

    public LocalScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    @Override
    public String getScopeName() {
        return "local";
    }

    @Override
    public int getOffset() {
        return offset;
    }

    @Override
    public void setOffset(int offset) {
        this.offset = offset;
    }
}
