package main.parser.symbolTable;

import java.util.ArrayList;

/**
 * Created by adrian on 11/2/15.
 */
public class ArraySymbol extends Symbol {

    public ArrayList<Integer> dimensions;

    public ArraySymbol(String name, Type type) {
        super(name, type);
        dimensions = new ArrayList<>();
    }


    public int getTotalSize() {
        int total = 1;
        for (int i = 0; i < dimensions.size(); i++) {
            total *= dimensions.get(i);
        }
        return total;
    }
}
