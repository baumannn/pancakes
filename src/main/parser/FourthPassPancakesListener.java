package main.parser;

import main.parser.symbolTable.FunctionSymbol;
import main.parser.symbolTable.GlobalScope;
import main.parser.symbolTable.Scope;
import main.parser.symbolTable.Symbol;
import main.parser.translation.OpCode;
import main.parser.translation.OpcodesList;
import main.parser.translation.Quadruple;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * Created by adrian on 11/24/15.
 */
public class FourthPassPancakesListener extends PancakesBaseListener {

    private final HashMap<PancakesParser.ExprContext, Symbol.Type> typeMap;

    private ParseTreeProperty<Scope> scopes; // todos los scopes
    private GlobalScope globals;
    private Scope currentScope;

    private HashMap<ParseTree, ArrayList<OpCode>> opcodes;
    ArrayList<OpCode> currentOpcodes;
    ArrayList<OpCode> constantOpcodes;
    ArrayList<OpCode> globalOpcodes;

    Stack<OpCode> pendingToFill;

    private short instruct_ptr = 0;

//    byte[] code = new byte[1000000];


    public FourthPassPancakesListener(GlobalScope globalScope, ParseTreeProperty<Scope> scopes, HashMap<PancakesParser.ExprContext, Symbol.Type> typeMap) {
        this.scopes = scopes;
        this.globals = globalScope;
        this.currentScope = globalScope;
        this.typeMap = typeMap;

        opcodes = new HashMap<>();

        constantOpcodes = new ArrayList<>();
        globalOpcodes = new ArrayList<>();
        pendingToFill = new Stack<>();

    }



      /*
     *****************
     * MANAGE SCOPES *
     *****************
     **/

    @Override
    public void enterPancakes(PancakesParser.PancakesContext ctx) {
        currentScope = globals;
        opcodes.put(ctx, globalOpcodes);
    }

    @Override
    public void enterFun_declare(PancakesParser.Fun_declareContext ctx) {
        currentScope = scopes.get(ctx);
        currentScope.setOffset(instruct_ptr);
        instruct_ptr = 0;
    }

    @Override
    public void exitFun_declare(PancakesParser.Fun_declareContext ctx) {
        FunctionSymbol function = (FunctionSymbol) currentScope;
        instruct_ptr = function.getOffset();

        currentScope = currentScope.getEnclosingScope();
    }



    @Override
    public void enterBlock(PancakesParser.BlockContext ctx) {

        currentScope = scopes.get(ctx);

        currentScope.setOffset(instruct_ptr);
        instruct_ptr = 0;

    }

    @Override
    public void exitBlock(PancakesParser.BlockContext ctx) {

        instruct_ptr = currentScope.getOffset();

        currentScope = currentScope.getEnclosingScope();
    }







    /*
     *****************
     * Assignment *
     *****************
     **/


    @Override
    public void exitAssignment(PancakesParser.AssignmentContext ctx) {

        List<TerminalNode> ids = ctx.ID();

        for (int i = ids.size() - 1; i >= 0; i--) {
           currentOpcodes.add(new OpCode(OpCode.STORE, currentScope.resolve(ids.get(0).getSymbol().getText()).getAddress()));
            instruct_ptr +=2;
        }
        currentOpcodes.add(new OpCode(OpCode.POP));
        instruct_ptr++;
    }

    /*
     *****************
     * Binary operands *
     *****************
     **/
    @Override
    public void exitMultDiv(PancakesParser.MultDivContext ctx) {
        if (typeMap.get(ctx.expr(0)) == Symbol.Type.tFLOAT || typeMap.get(ctx.expr(1)) == Symbol.Type.tFLOAT){
            if (ctx.MULT() != null) {
                currentOpcodes.add( new OpCode(OpCode.fMUL));
            } else{
                currentOpcodes.add(new OpCode(OpCode.fDIV));
            }
        } else{
            if (ctx.MULT() != null) {
                currentOpcodes.add(new OpCode(OpCode.iMUL));
            } else{
                currentOpcodes.add(new OpCode(OpCode.iDIV));
            }
        }

        instruct_ptr++;
    }



    @Override
    public void exitAddSub(PancakesParser.AddSubContext ctx) {
        if (typeMap.get(ctx.expr(0)) == Symbol.Type.tFLOAT || typeMap.get(ctx.expr(1)) == Symbol.Type.tFLOAT){
            if (ctx.ADD() != null) {
                currentOpcodes.add(new OpCode(OpCode.fADD));
            } else{
                currentOpcodes.add(new OpCode(OpCode.fSUB));
            }
        } else{
            if (ctx.ADD() != null) {
                currentOpcodes.add(new OpCode(OpCode.iADD));
            } else{
                currentOpcodes.add(new OpCode(OpCode.iSUB));
            }
        }
        instruct_ptr++;

    }

    @Override
    public void exitIntdiv(PancakesParser.IntdivContext ctx) {
        currentOpcodes.add(new OpCode(OpCode.INTDIV));
        instruct_ptr++;
    }

    @Override
    public void exitEquality(PancakesParser.EqualityContext ctx) {
        if (typeMap.get(ctx.expr(0)) == Symbol.Type.tFLOAT || typeMap.get(ctx.expr(1)) == Symbol.Type.tFLOAT){
            currentOpcodes.add(new OpCode(OpCode.fEQ));
        } else if (typeMap.get(ctx.expr(0)) == Symbol.Type.tINT || typeMap.get(ctx.expr(1)) == Symbol.Type.tINT){
            currentOpcodes.add(new OpCode(OpCode.iEQ));
        } else if (typeMap.get(ctx.expr(0)) == Symbol.Type.tBOOL || typeMap.get(ctx.expr(1)) == Symbol.Type.tBOOL){
            currentOpcodes.add(new OpCode(OpCode.bEQ));
        } else if (typeMap.get(ctx.expr(0)) == Symbol.Type.tSTRING || typeMap.get(ctx.expr(1)) == Symbol.Type.tSTRING){
            currentOpcodes.add(new OpCode(OpCode.sEQ));
        }

        instruct_ptr++;
    }


    /*
     *****************
     * Unary operands *
     *****************
     **/

    @Override
    public void exitUnaryNot(PancakesParser.UnaryNotContext ctx) {
        currentOpcodes.add(new OpCode(OpCode.NOT));
        instruct_ptr++;
    }

    @Override
    public void enterUnaryNegate(PancakesParser.UnaryNegateContext ctx) {
        if (typeMap.get(ctx.expr()) == Symbol.Type.tFLOAT){
            currentOpcodes.add(new OpCode(OpCode.fNEG));
        } else {
            currentOpcodes.add(new OpCode(OpCode.iNEG));
        }
        instruct_ptr++;
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

        OpCode functionCall = new OpCode(OpCode.CALL, (short) 0, (short) sym.getArgs().size());
        instruct_ptr += 3;

        pending.addFunctionCall(functionCall, sym);

        currentOpcodes.add(functionCall);

    }

     /*
     *****************
     * LOOPS AND IF's *
     *****************
     **/


    @Override
    public void exitIf_statement(PancakesParser.If_statementContext ctx) {
        //////update IF or Else's opcode
        OpCode update = pendingToFill.pop();
        update.setSecondOp(instruct_ptr);
        //////
    }

    @Override
    public void exitIf_expr(PancakesParser.If_exprContext ctx) {
        OpCode ifop = new OpCode(OpCode.GOTOF, (short) 0);
        instruct_ptr += 2;
        currentOpcodes.add(ifop);
        pendingToFill.push(ifop);
        pending.addOffset(ifop);
    }

    @Override
    public void enterElse_statement(PancakesParser.Else_statementContext ctx) {
        OpCode ifop = new OpCode(OpCode.GOTO, (short) 0);
        instruct_ptr += 2;

        //////First update IF opcode, don't add ifop opcode yet
        OpCode update = pendingToFill.pop();
        update.setSecondOp(instruct_ptr);
        //////

        pendingToFill.push(ifop);
        currentOpcodes.add(ifop);
        pending.addOffset(ifop);
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
        currentOpcodes.add( new OpCode(OpCode.bCONST, result) );
        instruct_ptr += 2;
    }

    @Override
    public void exitFloatConst(PancakesParser.FloatConstContext ctx) {
        OpCode op = new OpCode(OpCode.fCONST, (short) 0);
        pending.addFloatConstant(op, ctx.FLOAT().getSymbol().getText());
        currentOpcodes.add(op);
        instruct_ptr += 2;
    }

    @Override
    public void exitStringConst(PancakesParser.StringConstContext ctx) {
        OpCode op = new OpCode(OpCode.sCONST, (short) 0);
        pending.addStringConstant(op, ctx.STRING().getSymbol().getText());
        currentOpcodes.add(op);
        instruct_ptr += 2;
    }

    @Override
    public void exitIntConst(PancakesParser.IntConstContext ctx) {
        int result = Integer.parseInt(ctx.INT().getSymbol().getText());
        currentOpcodes.add( new OpCode(OpCode.iCONST, (short) result) );
        instruct_ptr += 2;
    }

    @Override
    public void exitVarRef(PancakesParser.VarRefContext ctx) {
       Symbol sym = currentScope.resolve(ctx.ID().getSymbol().getText());
        OpCode op = new OpCode(OpCode.LOAD, sym.getAddress());
        pending.addOffset(op, sym.getScope());
        currentOpcodes.add(op);
    }


     /*
     *****************
     * Expressions *
     *****************
     **/


    
    /*
     ****************
     * Helper functions
     *
     *****************
     */

}
