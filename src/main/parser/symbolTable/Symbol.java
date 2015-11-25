package main.parser.symbolTable;

/**
 * Created by adrian on 11/2/15.
 */
public class Symbol {

    public static enum Type {tINVALID, tVOID, tINT, tFLOAT, tBOOL, tSTRING};

    private String name; //name of symbol
    private Type type;
    private Scope scope;
    private short address;

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

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        return scope;
    }

    public Type getType() {
        return type;
    }

    public short getAddress() {
        return address;
    }

    public void setAddress(short address) {
        this.address = address;
    }

}
