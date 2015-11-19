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
        this.currentScope = globals;
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
        Symbol sym = currentScope.resolve(funName);

        if( sym == null){
            Main.logError(ctx.ID().getSymbol(), "Error: Function name not declared: " + funName);
            return;
        }

        if(sym instanceof VariableSymbol){
            Main.logError(ctx.ID().getSymbol(), "Error: Name refers to variable: " + funName);
            return;
        }

        FunctionSymbol funSym = (FunctionSymbol) currentScope.resolve(funName);
        System.out.println(ctx.arguments());
        System.out.println(ctx.ID());
        System.out.println(ctx.ID().getText());
        System.out.println(ctx.ID().getSymbol().getText());

        if ( (ctx.arguments() == null && funSym.getArgs().size() > 0) ||  (funSym.getArgs().size() != ctx.arguments().expr().size())){
            Main.logError(ctx.ID().getSymbol(),
                    "Argument count mismatch in "
                            + funName
                            + ", expected:"
                            + funSym.getArgs().size()
                            + ", got:"
                            + ((ctx.arguments() != null)? ctx.arguments().expr().size() : "0") );
            return;
        }

    }


}
