package main.parser.symbolTable;

/**
 * Created by adrian on 11/2/15.
 */
public class GlobalScope extends BaseScope {

    int offset = 0;

    public GlobalScope(){
        super(null);

    }

    @Override
    public String getScopeName() {
        return "global";
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
