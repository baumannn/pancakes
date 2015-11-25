package main.parser.compiler;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

/**
 * Created by adrian on 11/24/15.
 */
public class OpcodesList {

    private ArrayList<OpCode> opCodes;
    private ParseTree enclosingContext;

    public OpcodesList(ParseTree enclosingContext) {

        opCodes = new ArrayList<>();
        this.enclosingContext = enclosingContext;
    }
}
