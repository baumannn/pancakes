package main.parser.compiler;

import main.parser.generated.PancakesBaseListener;
import main.parser.generated.PancakesParser;
import main.parser.symbolTable.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * Created by adrian on 11/25/15.
 */
public class TranslationThirdPhase extends PancakesBaseListener{

    private final int startCode;
    private GlobalScope globalScope;
    private ParseTreeProperty<Scope> scopes;
    private ArrayList<Integer> mfo;
    private int ip;
    private HashMap<Symbol, Integer> varReferences;
    private HashMap<String, Integer> fConst;
    private HashMap<String, Integer> sConst;
    private HashMap<ParserRuleContext, Symbol.Type> typeMap;
    private Stack<Integer> pendingToFill;
    private HashMap<Integer, FunctionSymbol> functionCallLocations;
    private HashMap<FunctionSymbol, Integer> functionLocations;

    private Scope currentScope;
    private int fp;

    public TranslationThirdPhase(GlobalScope globalScope, ParseTreeProperty<Scope> scopes, ArrayList<Integer> mfo, int ip, HashMap<Symbol, Integer> varReferences, HashMap<String, Integer> fConst, HashMap<String, Integer> sConst, HashMap<ParserRuleContext, Symbol.Type> typeMap) {
        this.globalScope = globalScope;
        this.scopes = scopes;
        this.mfo = mfo;
        this.ip = ip;
        this.varReferences = varReferences;
        this.fConst = fConst;
        this.sConst = sConst;
        this.typeMap = typeMap;
        this.currentScope = globalScope;

        startCode = ip;
        mfo.set(1, startCode);

        pendingToFill = new Stack<>();
        functionCallLocations = new HashMap<>();
        functionLocations = new HashMap<>();
    }

    @Override
    public void enterPancakes(PancakesParser.PancakesContext ctx) {
    }

    //todo implement
    @Override
    public void enterFun_declare(PancakesParser.Fun_declareContext ctx) {
        currentScope = scopes.get(ctx);

        fp = ip;

        FunctionSymbol fs = (FunctionSymbol) currentScope;
        int i = 0;
        for (String arguments : fs.getArgs().keySet()) {
            fs.getArgs().get(arguments).setAddress(-3 - i);
            i++;
        }

        mfo.add(OpCode.GOTO);
        ip++;
        mfo.add(new Integer(0));
        pendingToFill.push(ip);
        ip++;

        functionLocations.put((FunctionSymbol) currentScope, ip);




    }


    //todo implement
    @Override
    public void exitFun_declare(PancakesParser.Fun_declareContext ctx) {

        currentScope = currentScope.getEnclosingScope();
        fp = 0;

        int update = pendingToFill.pop();
        mfo.set(update, ip);

    }


    //todo implement
    @Override
    public void enterBlock(PancakesParser.BlockContext ctx) {

        currentScope = scopes.get(ctx);

        int i = 0;
        for (String arguments : currentScope.getSymbols().keySet() ) {
            if (currentScope.getSymbols().get(arguments) instanceof VariableSymbol){
                VariableSymbol vs = (VariableSymbol) currentScope.getSymbols().get(arguments);
                vs.setAddress(ip-fp + 1);
                mfo.add(OpCode.iCONST);
                ip++;
                mfo.add(new Integer(0));
                ip++;
            }
        }

    }

    //todo implement
    @Override
    public void exitBlock(PancakesParser.BlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }



    /*
     *****************
     * Assignment *
     *****************
     **/


    @Override
    public void exitAssignment(PancakesParser.AssignmentContext ctx) {
        System.out.println("Assignment " + ip);
        List<TerminalNode> ids = ctx.ID();

        for (int i = ids.size() - 1; i >= 0; i--) {
            String name = ctx.ID(i).getSymbol().getText();
            Symbol sym = currentScope.resolve(name);
            if ( sym.getScope() == globalScope){
                mfo.add(OpCode.GSTORE);
                ip++;
            } else{
                mfo.add(OpCode.STORE);
                ip++;
            }
            mfo.add(sym.getAddress());
            ip++;
        }
        mfo.add(OpCode.POP);
        ip++;
    }

    @Override
    public void exitVar_declare(PancakesParser.Var_declareContext ctx) {
        System.out.println("Assignment dec " + ip);
        if (ctx.EQUAL() != null){

            String name = ctx.ID().getSymbol().getText();
            Symbol sym = currentScope.resolve(name);

            if ( sym.getScope() == globalScope){
                mfo.add(OpCode.GSTORE);
                ip++;
            } else{
                mfo.add(OpCode.STORE);
                ip++;
            }
            mfo.add(sym.getAddress());
            ip++;

        }
    }

       /*
     *****************
     * Var refs      *
     *****************
     **/

    @Override
    public void exitVarRef(PancakesParser.VarRefContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol sym = currentScope.resolve(name);

        if ( sym.getScope() == globalScope){
            mfo.add(OpCode.GLOAD);
            ip++;
        } else{
            mfo.add(OpCode.LOAD);
            ip++;
        }

        mfo.add(sym.getAddress());
        ip++;
    }


    /*
     *****************
     * Function calls *
     *****************
     **/


    @Override
    public void exitFunCall(PancakesParser.FunCallContext ctx) {
        String funName = ctx.ID().getSymbol().getText();
        FunctionSymbol sym = (FunctionSymbol) currentScope.resolve(funName);

        mfo.add(OpCode.CALL);
        ip++;
        mfo.add(0);
        functionCallLocations.put(ip, sym);
        ip ++;
        mfo.add(sym.getArgs().size());
        ip++;

    }




     /*
     *****************
     * LOOPS AND IF's *
     *****************
     **/



    @Override
    public void exitIf_expr(PancakesParser.If_exprContext ctx) {
        mfo.add(OpCode.GOTOF);
        ip++;
        mfo.add(0); // dummy address
        pendingToFill.add(ip);
        ip++;
    }

    @Override
    public void enterElse_statement(PancakesParser.Else_statementContext ctx) {
        //////First update IF opcode
        int update = pendingToFill.pop();
        mfo.set(update, ip);
        //////


        mfo.add(OpCode.GOTO);
        ip++;
        mfo.add(0); //dummy address;
        pendingToFill.push(ip);
        ip++;

    }


    @Override
    public void exitIf_statement(PancakesParser.If_statementContext ctx) {
        //////update IF or Else's opcode
        int update = pendingToFill.pop();
        mfo.set(update, ip);
        //////
    }






    /*
     ****************
     * Binary ops
     *
     *****************
     */



    @Override
    public void exitMultDiv(PancakesParser.MultDivContext ctx) {
        if (typeMap.get(ctx.expr(0)) == Symbol.Type.tFLOAT || typeMap.get(ctx.expr(1)) == Symbol.Type.tFLOAT){
            if (ctx.MULT() != null) {
                mfo.add( OpCode.fMUL);
            } else{
                mfo.add(OpCode.fDIV);
            }
        } else{
            if (ctx.MULT() != null) {
                mfo.add(OpCode.iMUL);
            } else{
                mfo.add(OpCode.iDIV);
            }
        }

        ip++;
    }



    @Override
    public void exitAddSub(PancakesParser.AddSubContext ctx) {
        if (typeMap.get(ctx.expr(0)) == Symbol.Type.tFLOAT || typeMap.get(ctx.expr(1)) == Symbol.Type.tFLOAT){
            if (ctx.ADD() != null) {
                mfo.add(OpCode.fADD);
            } else{
                mfo.add(OpCode.fSUB);
            }
        } else{
            if (ctx.ADD() != null) {
                mfo.add(OpCode.iADD);
            } else{
                mfo.add(OpCode.iSUB);
            }
        }
        ip++;

    }

    @Override
    public void exitIntdiv(PancakesParser.IntdivContext ctx) {
        mfo.add(OpCode.INTDIV);
        ip++;
    }

    @Override
    public void exitEquality(PancakesParser.EqualityContext ctx) {
        //todo params
        if (typeMap.get(ctx.expr(0)) == Symbol.Type.tFLOAT || typeMap.get(ctx.expr(1)) == Symbol.Type.tFLOAT){
            mfo.add(OpCode.fEQ);
        } else if (typeMap.get(ctx.expr(0)) == Symbol.Type.tINT || typeMap.get(ctx.expr(1)) == Symbol.Type.tINT){
            mfo.add(OpCode.iEQ);
        } else if (typeMap.get(ctx.expr(0)) == Symbol.Type.tBOOL || typeMap.get(ctx.expr(1)) == Symbol.Type.tBOOL){
            mfo.add(OpCode.bEQ);
        } else if (typeMap.get(ctx.expr(0)) == Symbol.Type.tSTRING || typeMap.get(ctx.expr(1)) == Symbol.Type.tSTRING){
            mfo.add(OpCode.sEQ);
        }

        ip++;
    }




    /*
     ****************
     * Unary ops
     *
     *****************
     */


    @Override
    public void exitUnaryNot(PancakesParser.UnaryNotContext ctx) {
        mfo.add(OpCode.NOT);
        ip++;
    }

    @Override
    public void enterUnaryNegate(PancakesParser.UnaryNegateContext ctx) {
        if (typeMap.get(ctx.expr()) == Symbol.Type.tFLOAT){
            mfo.add(OpCode.fNEG);
        } else {
            mfo.add(OpCode.iNEG);
        }
        ip++;

    }

    /*
     ****************
     * return
     *
     *****************
     */

    @Override
    public void exitReturn_statement(PancakesParser.Return_statementContext ctx) {
        mfo.add(OpCode.RET);
        ip++;
    }



    /*
     ****************
     * Constants
     *
     *****************
     */




    @Override
    public void exitBoolConst(PancakesParser.BoolConstContext ctx) {
        int result = ctx.BOOLEAN().getSymbol().getText().equals("true") ? 1 : 0;
        mfo.add(OpCode.bCONST);
        mfo.add(result);
        ip+=2;
    }

    @Override
    public void exitFloatConst(PancakesParser.FloatConstContext ctx) {
        mfo.add(OpCode.fCONST);
        mfo.add(fConst.get(ctx.FLOAT().getSymbol().getText()));
        ip+=2;
    }

    @Override
    public void exitStringConst(PancakesParser.StringConstContext ctx) {
        mfo.add(OpCode.sCONST);

        String str = ctx.STRING().getText();
        str = str.replace("\"", "");
        mfo.add(sConst.get(str));
        ip+=2;
    }

    @Override
    public void exitIntConst(PancakesParser.IntConstContext ctx) {
        Integer result = Integer.parseInt(ctx.INT().getSymbol().getText());
        mfo.add(OpCode.iCONST);
        mfo.add(result);
        ip+=2;
    }



    /*
     ****************
     * BUILT IN
     *
     *****************
     */

    @Override
    public void exitPrintFunc(PancakesParser.PrintFuncContext ctx) {
        Symbol.Type type = typeMap.get(ctx.expr());

        switch (type){
            case tSTRING:
                mfo.add(OpCode.sPRINT);
                break;
            case tINT:
            case tBOOL:
                mfo.add(OpCode.iPRINT);
                break;
            case tFLOAT:
                mfo.add(OpCode.fPRINT);
                break;
        }
    }



    /*
     ****************
     * Debug printer and stuff
     *
     *****************
     */

    public ArrayList<Integer> getMfo() {
        return mfo;
    }

    @Override
    public void exitPancakes(PancakesParser.PancakesContext ctx) {
        mfo.add(OpCode.HALT);
        ip++;

        updateFunctionCalls();

        System.out.print(mfo);
        translate(startCode);
    }

    private void updateFunctionCalls() {
        for (Integer integer : functionCallLocations.keySet()) {
            mfo.set(integer, functionLocations.get( functionCallLocations.get(integer) ));
        }

    }

    private void translate(int startCode) {
        for (int i = startCode; i < mfo.size(); i++) {
            System.out.print(OpCode.translateOpCode(mfo.get(i)) + "\t");
            int numOpers = OpCode.numberOfOperands(mfo.get(i));
            for (int j = 0; j < numOpers; j++){
                i++;
                if(mfo.get(i-1) == OpCode.CALL){
                    for (FunctionSymbol fs : functionLocations.keySet()) {
                        if (functionLocations.get(fs) == mfo.get(i)){
                            System.out.print(fs.getName() + " ");
                            break;
                        }
                    }

                } else {
                    System.out.print(mfo.get(i) + " ");
                }

            }

            while ( (3 - numOpers) >= 0){
                System.out.print("\t");
                numOpers++;
            }

            System.out.println("// " + i);


        }
    }





}
