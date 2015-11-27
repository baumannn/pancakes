package main.parser.compiler;

import com.sun.xml.internal.ws.client.RequestContext;
import main.parser.generated.PancakesBaseListener;
import main.parser.generated.PancakesParser;
import main.parser.symbolTable.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.nio.ByteBuffer;
import java.util.*;

/**
 * Created by adrian on 11/25/15.
 */
public class TranslationThirdPhase extends PancakesBaseListener{

    private final int startCode;
    private GlobalScope globalScope;
    private ParseTreeProperty<Scope> scopes;
    private static ArrayList<Integer> mfo;
    private int ip;
    private HashMap<Symbol, Integer> varReferences;
    private HashMap<String, Integer> fConst;
    private HashMap<String, Integer> sConst;
    private HashMap<ParserRuleContext, Symbol.Type> typeMap;
    private Stack<Integer> pendingToFill;
    private HashMap<Integer, FunctionSymbol> functionCallLocations;
    private HashMap<FunctionSymbol, Integer> functionLocations;
    private HashMap<ParserRuleContext, ArrayList<Integer>> offsetHM;

    private Scope currentScope;
    private int fp;
    private HashMap<ParserRuleContext, Boolean> offsetFlag;

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
        offsetHM = new HashMap<>();
        offsetFlag = new HashMap<>();
    }

    @Override
    public void enterPancakes(PancakesParser.PancakesContext ctx) {
    }



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


    @Override
    public void exitFun_declare(PancakesParser.Fun_declareContext ctx) {

        currentScope = currentScope.getEnclosingScope();
        fp = 0;

        int update = pendingToFill.pop();
        mfo.set(update, ip);
    }


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
    public void enterArray_assignment(PancakesParser.Array_assignmentContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        ArraySymbol sym = (ArraySymbol) currentScope.resolve(name);
        ArrayList<Integer> offsets = new ArrayList<>();

        offsets.add(sym.dimensions.size()); //first element has dimensions of array
        offsetFlag.put(ctx, false);


        int mn = 1;

//        for (int i = 0; i < sym.dimensions.size(); i++) {
//            offsets.add(mn);
//            mn *= sym.dimensions.get(i);
//        }

        for (int i = sym.dimensions.size() - 1; i >= 0; i--) {
            offsets.add(mn);
            mn *= sym.dimensions.get(i);
        }

//        for (int i = sym.dimensions.size() - 1; i >= 0; i--) {
//            mn *= sym.dimensions.get(i);
//        }
//
//        for (int i = sym.dimensions.size() - 1; i >= 0; i--) {
//            mn /= sym.dimensions.get(i);
//            offsets.add(mn);
//        }

        //Collections.reverse(offsets);
        offsetHM.put(ctx, offsets);

    }


    @Override
    public void exitArray_assignment(PancakesParser.Array_assignmentContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        ArraySymbol sym = (ArraySymbol) currentScope.resolve(name);
        ArrayList<Integer> offsets = new ArrayList<>();

//        Integer store = mfo.get(ip -1)
//
//        for (int i = 0; i < sym.dimensions.size(); i++) {
//            mfo.add(OpCode.iADD);
//            ip++;
//        }

        if (sym.getScope() == globalScope){
            mfo.add(OpCode.oGSTORE);
            ip++;
        } else{
            mfo.add(OpCode.oSTORE);
            ip++;
        }

        mfo.add(sym.getAddress());
        ip++;
    }






    ////////////

    @Override
    public void exitAssignment(PancakesParser.AssignmentContext ctx) {
        System.out.println("Assignment " + ip);
        List<TerminalNode> ids = ctx.ID();

        for (int i = ids.size() - 1; i > 0; i--) {
            String name = ctx.ID(i).getSymbol().getText();
            Symbol sym = currentScope.resolve(name);

            mfo.add(OpCode.DUP); //duplica el valor para que sea disponible para la siguiente asignacion
            ip++;

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

        String name = ctx.ID(0).getSymbol().getText();
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

//        mfo.add(OpCode.POP);
//        ip++;
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
     * ARRAYS refs      *
     *****************
     **/

    @Override
    public void enterArrayIndex(PancakesParser.ArrayIndexContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        ArraySymbol sym = (ArraySymbol) currentScope.resolve(name);
        ArrayList<Integer> offsets = new ArrayList<>();


        offsets.add(sym.dimensions.size()); //first element has dimensions of array
        offsetFlag.put(ctx, false);
        int mn = 1;

        for (int i = sym.dimensions.size() - 1; i >= 0; i--) {
            offsets.add(mn);
            mn *= sym.dimensions.get(i);
        }

//        for (int i = sym.dimensions.size() - 1; i >= 0; i--) {
//            mn *= sym.dimensions.get(i);
//        }
//
//        for (int i = sym.dimensions.size() - 1; i >= 0; i--) {
//            mn /= sym.dimensions.get(i);
//            offsets.add(mn);
//        }



        //Collections.reverse(offsets);
        offsetHM.put(ctx, offsets);
    }

    @Override
    public void enterClose_bracket(PancakesParser.Close_bracketContext ctx) {
        ArrayList<Integer> offsets = offsetHM.get(ctx.getParent());
        System.out.print(offsets);
        int currentOffset = offsets.get(0);
        //update offsets
        offsets.set(0, currentOffset - 1);

        //System.out.print("h  " + offsets.get(currentOffset));

        mfo.add(OpCode.iCONST);
        ip++;
        mfo.add(offsets.get(currentOffset));
        ip++;

        if(true || offsetFlag.get(ctx.getParent())){ //dont enter the first time
            mfo.add(OpCode.iMUL);
            ip++;
        }

        if(offsets.get(0) == 0){
            for (int i = 0; i < offsets.size() - 2; i++) {
                mfo.add(OpCode.iADD);
                ip++;
            }
        }


        offsetFlag.put(ctx.getParent(), true);

    }

    @Override
    public void exitArrayIndex(PancakesParser.ArrayIndexContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        ArraySymbol sym = (ArraySymbol) currentScope.resolve(name);
        ArrayList<Integer> offsets = new ArrayList<>();

//        for (int i = 0; i < sym.dimensions.size(); i++) {
//            mfo.add(OpCode.iADD);
//            ip++;
//        }

        if (currentScope == globalScope){
            mfo.add(OpCode.oGLOAD);
            ip++;
        } else{
            mfo.add(OpCode.oLOAD);
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


    @Override
    public void enterWhile_statement(PancakesParser.While_statementContext ctx) {
        pendingToFill.push(ip);
    }

    @Override
    public void exitWhile_statement(PancakesParser.While_statementContext ctx) {
        int update = pendingToFill.pop();

        mfo.add(OpCode.GOTO);
        ip++;
        mfo.add(pendingToFill.pop());
        ip++;


        mfo.set(update, ip);
    }


    @Override
    public void exitDo_if_expr(PancakesParser.Do_if_exprContext ctx) {
        mfo.add(OpCode.GOTOT);
        ip++;
        mfo.add(pendingToFill.pop()); // dummy address
        ip++;
    }

    @Override
    public void enterDo_while_statement(PancakesParser.Do_while_statementContext ctx) {
        pendingToFill.push(ip);
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
        } else if (typeMap.get(ctx.expr(0)) == Symbol.Type.tINT || typeMap.get(ctx.expr(1)) == Symbol.Type.tINT){
            mfo.add(OpCode.bEQ);
        } else if (typeMap.get(ctx.expr(0)) == Symbol.Type.tSTRING || typeMap.get(ctx.expr(1)) == Symbol.Type.tSTRING){
            mfo.add(OpCode.sEQ);
        }

        ip++;
    }

    @Override
    public void exitLTGT(PancakesParser.LTGTContext ctx) {
        if (typeMap.get(ctx.expr(0)) == Symbol.Type.tFLOAT || typeMap.get(ctx.expr(1)) == Symbol.Type.tFLOAT){
            if (ctx.LT() != null) {
                mfo.add(OpCode.fLT);
            } else{
                mfo.add(OpCode.fGT);
            }
        } else{
            if (ctx.LT() != null) {
                mfo.add(OpCode.iLT);
            } else{
                mfo.add(OpCode.iGT);
            }
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
    public void exitUnaryNegate(PancakesParser.UnaryNegateContext ctx) {
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
        byte[] b = ByteBuffer.allocate(4).putFloat( new Float(ctx.FLOAT().getSymbol().getText())).array();
        int floatAsInt = ByteBuffer.wrap(b).getInt();
        mfo.add(floatAsInt);
        ip+=2;
    }

    @Override
    public void exitStringConst(PancakesParser.StringConstContext ctx) {
        mfo.add(OpCode.sCONST);

        String str = ctx.STRING().getText();
        str = str.replace("\"", "");
        str = str.replace("\\n", "\n");
        str = str.replace("\\r", "\r");
        str = str.replace("\\t", "\t");
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

        switch (type) {
            case tSTRING:
                mfo.add(OpCode.sPRINT);
                break;
            case tINT:
                mfo.add(OpCode.iPRINT);
                break;
            case tFLOAT:
                mfo.add(OpCode.fPRINT);
                break;
        }
        ip++;
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

        printInstructions();


    }

    private void printInstructions() {

        for (int i = 0; i < mfo.size(); i++) {

            int opcode = mfo.get(i);
            StringBuilder buffer = new StringBuilder();

            if (i >= startCode){
                String opName = OpCode.translateOpCode(opcode);
                buffer.append(String.format("%04d:\t%-11s", i, opName));
                int nargs = OpCode.numberOfOperands(opcode);
                if (nargs > 0) {
                    nargs = i + nargs;

                    if (opcode == OpCode.CALL) {
                        i++;
                        buffer.append(translateFunction(mfo.get(i)));
                        buffer.append("  ");
                    }
                    for (int j = i + 1; j <= nargs; j++) {
                        buffer.append(String.valueOf(mfo.get(j)));
                        buffer.append("  ");
                        i++;
                    }
                }
            } else{
                buffer.append(String.format("%04d:\t%-11d", i, opcode));
            }

            //buffer.append("\n");
            System.out.println(String.format("%-35s", buffer.toString()));
        }


    }

    private String translateFunction(Integer integer) {
        for (FunctionSymbol functionSymbol : functionLocations.keySet()) {
            if ( functionLocations.get(functionSymbol) == integer){
                return functionSymbol.getName();
            }
        }
        return Integer.toString(integer);
    }

    private void updateFunctionCalls() {
        for (Integer integer : functionCallLocations.keySet()) {
            mfo.set(integer, functionLocations.get( functionCallLocations.get(integer) ));
        }

    }

    private void translate(int startCode) {
        for (int i = startCode; i < mfo.size(); i++){
            if (mfo.get(i) == null){
                continue;
            }

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
