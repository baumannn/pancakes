package main.parser;

import main.parser.symbolTable.GlobalScope;
import main.parser.symbolTable.Scope;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Created by adrian on 11/6/15.
 */
public class SecondPassPancakesListener extends PancakesBaseListener {


    ParseTreeProperty <Scope> scopes; // todos los scopes
    GlobalScope globals;
    Scope currentScope;

    public SecondPassPancakesListener(GlobalScope globalScope, ParseTreeProperty<Scope> scopes) {

        globals = globalScope;
        this.scopes = scopes;
    }



}
