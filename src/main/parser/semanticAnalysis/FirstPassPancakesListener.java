package main.parser.semanticAnalysis;

import main.pancakes.Main;
import main.parser.generated.PancakesBaseListener;
import main.parser.generated.PancakesParser;
import main.parser.symbolTable.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Registers variables and functions in scopes.
 */
public class FirstPassPancakesListener extends PancakesBaseListener {


    private ParseTreeProperty <Scope> scopes = new ParseTreeProperty<>(); // todos los scopes
    private GlobalScope globals; //todo ???
    Scope currentScope;



    ////////////////
    // listeners ///
    ////////////////

    @Override
    public void enterPancakes(PancakesParser.PancakesContext ctx) {

        globals = new GlobalScope();


        currentScope = globals;


    }


    @Override
    public void exitVar_declare(PancakesParser.Var_declareContext ctx) {

        if( !defineVar(ctx.type(), ctx.ID().getSymbol())){
            Main.logError(ctx.ID().getSymbol(), "Error: Redefinition of variable: " +  ctx.ID().getText());
        }

    }

    @Override
    public void exitArray_declare(PancakesParser.Array_declareContext ctx) {
        ArraySymbol arrSym = defineArray(ctx.type(), ctx.ID().getSymbol());
        if( arrSym == null){
            Main.logError(ctx.ID().getSymbol(), "Error: Redefinition of variable: " +  ctx.ID().getText());
        } else{
            for (TerminalNode terminalNode : ctx.INT()) {
                arrSym.dimensions.add(Integer.parseInt(terminalNode.toString()));
            }
        }

    }

    @Override
    public void enterFun_declare(PancakesParser.Fun_declareContext ctx) {

        String name = ctx.ID().getText();

        int typeTokenType = ctx.type().start.getType();
        Symbol.Type type = Main.getType(typeTokenType);


        FunctionSymbol function = new FunctionSymbol(name,type,currentScope);
        if( !currentScope.isDefined(function)) {
            currentScope.define(function);
            scopes.put(ctx, function); //set function parent to ctx
            currentScope = function;
        } else{
            function = new FunctionSymbol(name + "#" + ctx.ID().getSymbol().getLine(),type,currentScope);
            currentScope.define(function);
            scopes.put(ctx, function); //set function parent to ctx
            currentScope = function;
            Main.logError(ctx.ID().getSymbol(), "Error: Function was already declared: " + name);

        }


    }


    @Override
    public void exitFun_declare(PancakesParser.Fun_declareContext ctx) {

        currentScope = currentScope.getEnclosingScope(); //pop pop
    }


    @Override
    public void exitFun_param(PancakesParser.Fun_paramContext ctx) {

        if( !defineVar(ctx.type(), ctx.ID().getSymbol())){
            Main.logError(ctx.ID().getSymbol(), "Error: Redefinition of variable: " + ctx.ID().getText());
        }


    }


    @Override
    public void enterBlock(PancakesParser.BlockContext ctx) {

        LocalScope lc = new LocalScope(currentScope);

        currentScope = lc;

        scopes.put(ctx, lc);
    }

    @Override
    public void exitBlock(PancakesParser.BlockContext ctx) {

        currentScope = currentScope.getEnclosingScope();
    }




    //






    ////////////////
    // helper functions ///
    ////////////////


    boolean defineVar(PancakesParser.TypeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = Main.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);

        if( !currentScope.isDefined(var)) {
            currentScope.define(var);
            return true;
        }

        return false;
    }

    ArraySymbol defineArray(PancakesParser.TypeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = Main.getType(typeTokenType);
        ArraySymbol var = new ArraySymbol(nameToken.getText(), type);

        if( !currentScope.isDefined(var)) {
            currentScope.define(var);
            return var;
        }

        return null;
    }


    public ParseTreeProperty<Scope> getScopes() {
        return scopes;
    }

    public GlobalScope getGlobals() {
        return globals;
    }
}
