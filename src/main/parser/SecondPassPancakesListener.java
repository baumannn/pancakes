package main.parser;

import main.pancakes.Main;
import main.parser.symbolTable.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Checks for correct references in variable and function names.
 */
public class SecondPassPancakesListener extends PancakesBaseListener {


    private ParseTreeProperty <Scope> scopes; // todos los scopes
    private GlobalScope globals;
    private Scope currentScope;

    public SecondPassPancakesListener(GlobalScope globalScope, ParseTreeProperty<Scope> scopes) {

        globals = globalScope;
        currentScope = globals;
        this.scopes = scopes;

    }

    @Override
    public void enterPancakes(PancakesParser.PancakesContext ctx) {
        currentScope = globals;
    }


    @Override
    public void exitFun_declare(PancakesParser.Fun_declareContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterFun_declare(PancakesParser.Fun_declareContext ctx) {
        currentScope = scopes.get(ctx);
    }

    @Override
    public void enterBlock(PancakesParser.BlockContext ctx) {
        currentScope = scopes.get(ctx);
    }

    @Override
    public void exitBlock(PancakesParser.BlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void exitVarRef(PancakesParser.VarRefContext ctx) {
        String varName = ctx.ID().getSymbol().getText();
        Symbol varSym = currentScope.resolve(varName);

        if( varSym == null){
            Main.logError(ctx.ID().getSymbol(), "Error: Variable name not declared: " + varName);
        }

        if(varSym instanceof FunctionSymbol){
            Main.logError(ctx.ID().getSymbol(), "Error: Name refers to function: " + varName);
        }
    }

    @Override
    public void exitFunCall(PancakesParser.FunCallContext ctx) {
        String funName = ctx.ID().getSymbol().getText();
        Symbol funSym = currentScope.resolve(funName);

        if( funSym == null){
            Main.logError(ctx.ID().getSymbol(), "Error: Function name not declared: " + funName);
        }

        if(funSym instanceof VariableSymbol){
            Main.logError(ctx.ID().getSymbol(), "Error: Name refers to variable: " + funName);
        }

    }


}
