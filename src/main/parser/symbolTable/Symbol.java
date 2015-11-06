package main.parser.symbolTable;

/**
 * Created by adrian on 11/2/15.
 */
public class Symbol {
    public String name; //name of symbol
    public Type type;

    public Symbol(String name) {
        this.name = name;
    }
    public Symbol(String name, Type type) {
        this(name);
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        if ( type!=null ) {
            return '<' + getName() + ":" + type + '>';
        }
        return getName();
    }

}
