package main.parser.symbolTable;

/**
 * Created by adrian on 11/2/15.
 */
public class GlobalScope extends BaseScope {

    public GlobalScope(){
        super(null);

    }

    @Override
    public String getScopeName() {
        return "global";
    }
}
