package main.parser;

import main.parser.symbolTable.GlobalScope;
import main.parser.symbolTable.Scope;
import main.parser.symbolTable.Symbol;
import main.parser.translation.OpCode;
import main.parser.translation.OpcodesList;
import main.parser.translation.Quadruple;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by adrian on 11/24/15.
 */
public class FourthPassPancakesListener extends PancakesBaseListener {

    private final HashMap<PancakesParser.ExprContext, Symbol.Type> typeMap;
    private ParseTreeProperty<Scope> scopes; // todos los scopes
    private GlobalScope globals;
    private Scope currentScope;

    private ParseTreeProperty<OpcodesList> opcodes;
    OpcodesList currentOpcodes;



    private int instruct_ptr = 0;


    public FourthPassPancakesListener(GlobalScope globalScope, ParseTreeProperty<Scope> scopes, HashMap<PancakesParser.ExprContext, Symbol.Type> typeMap) {
        this.scopes = scopes;
        this.globals = globalScope;
        this.currentScope = globalScope;
        this.typeMap = typeMap;

    }



      /*
     *****************
     * MANAGE SCOPES *
     *****************
     **/

    @Override
    public void enterPancakes(PancakesParser.PancakesContext ctx) {
        currentScope = globals;

        currentOpcodes  = new OpcodesList(null);
        opcodes.put(ctx, currentOpcodes); //global opcodes

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
     * Assignment *
     *****************
     **/


    @Override
    public void exitAssignment(PancakesParser.AssignmentContext ctx) {

        List<TerminalNode> ids = ctx.ID();

        for (int i = ids.size() - 1; i >= 0; i--) {
            System.out.printf("%04d: ASSIGN %s\n", instruct_ptr++, ids.get(i).getSymbol().getText());
        }

        System.out.printf("%04d: POP\n", instruct_ptr++);

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
                System.out.printf("%04d: fMULT\n", instruct_ptr++);
            } else{
                System.out.printf("%04d: fDIV\n", instruct_ptr++);
            }
        } else{
            if (ctx.MULT() != null) {
                System.out.printf("%04d: iMULT\n", instruct_ptr++);
            } else{
                System.out.printf("%04d: iDIV\n", instruct_ptr++);
            }
        }
    }



    @Override
    public void exitAddSub(PancakesParser.AddSubContext ctx) {
        if (typeMap.get(ctx.expr(0)) == Symbol.Type.tFLOAT || typeMap.get(ctx.expr(1)) == Symbol.Type.tFLOAT){
            if (ctx.ADD() != null) {
                System.out.printf("%04d: fADD\n", instruct_ptr++);
            } else{
                System.out.printf("%04d: fSUB\n", instruct_ptr++);
            }
        } else{
            if (ctx.ADD() != null) {
                System.out.printf("%04d: iADD\n", instruct_ptr++);
            } else{
                System.out.printf("%04d: iSUB\n", instruct_ptr++);
            }
        }

    }

    @Override
    public void exitIntdiv(PancakesParser.IntdivContext ctx) {
        if (typeMap.get(ctx.expr(0)) == Symbol.Type.tFLOAT || typeMap.get(ctx.expr(1)) == Symbol.Type.tFLOAT){
            System.out.printf("%04d: fINTDIV\n", instruct_ptr++);
        } else{
            System.out.printf("%04d: fINTDIV\n", instruct_ptr++);
        }
    }

    @Override
    public void exitEquality(PancakesParser.EqualityContext ctx) {

        System.out.printf("%04d: CMP\n", instruct_ptr++);
    }


    /*
     *****************
     * Unary operands *
     *****************
     **/

    @Override
    public void exitUnaryNot(PancakesParser.UnaryNotContext ctx) {
        System.out.printf("%04d: NOT\n", instruct_ptr++);
    }

    @Override
    public void enterUnaryNegate(PancakesParser.UnaryNegateContext ctx) {
        System.out.printf("%04d: NEGATE\n", instruct_ptr++);
    }

    /*
     *****************
     * Function calls *
     *****************
     **/


    @Override
    public void exitFunCall(PancakesParser.FunCallContext ctx) {

    }

    /*
     ****************
     * Constants
     *
     *****************
     */


    @Override
    public void exitBoolConst(PancakesParser.BoolConstContext ctx) {
        System.out.printf("%04d: PUSH %s\n", instruct_ptr++, ctx.BOOLEAN().getText());

    }

    @Override
    public void exitFloatConst(PancakesParser.FloatConstContext ctx) {
        System.out.printf("%04d: PUSH %s\n", instruct_ptr++, ctx.FLOAT().getText());
    }

    @Override
    public void exitStringConst(PancakesParser.StringConstContext ctx) {
        System.out.printf("%04d: CLOAD %s\n", instruct_ptr++, ctx.STRING().getText());
    }

    @Override
    public void exitIntConst(PancakesParser.IntConstContext ctx) {
        System.out.printf("%04d: PUSH %s\n", instruct_ptr++, ctx.INT().getText());
    }

    @Override
    public void exitVarRef(PancakesParser.VarRefContext ctx) {
        System.out.printf("%04d: LOAD %s\n", instruct_ptr++, ctx.ID().getText());
    }
    
    
    
    /*
     ****************
     * Helper functions
     *
     *****************
     */

}
