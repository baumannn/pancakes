package main.parser.compiler;

import main.parser.generated.PancakesBaseListener;
import main.parser.generated.PancakesParser;
import main.parser.symbolTable.GlobalScope;
import main.parser.symbolTable.Scope;
import main.parser.symbolTable.Symbol;
import main.parser.symbolTable.VariableSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by adrian on 11/25/15.
 */
public class TranslationFourthHalfPhase extends PancakesBaseListener {

    private Scope currentScope;
    private GlobalScope globalScope;
    private ArrayList<Integer> mfo;
    private int ip;
    private ParseTreeProperty<Scope> scopes;
    private HashMap<Symbol, ArrayList<Integer>> arrayReferences;

    public TranslationFourthHalfPhase(GlobalScope globalScope, ArrayList<Integer> mfo, int ip, ParseTreeProperty<Scope> scopes) {
        this.globalScope = globalScope;
        this.mfo = mfo;
        this.ip = ip;
        this.scopes = scopes;
        arrayReferences = new HashMap<>();

        currentScope = globalScope;

    }
       /*
     *****************
     * MANAGE SCOPES *
     *****************
     **/

    @Override
    public void enterPancakes(PancakesParser.PancakesContext ctx) {
        currentScope = globalScope;
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


   /*
     *****************
     * Handle array refs *
     *****************
     **/


    public ArrayList<Integer> getMfo() {
        return mfo;
    }

    public void setMfo(ArrayList<Integer> mfo) {
        this.mfo = mfo;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }


//    public void setVarReferences(HashMap<Symbol, Integer> varReferences) {
//        this.varReferences = varReferences;
//    }
}
