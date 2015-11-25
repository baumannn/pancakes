package main.parser.translation;

import main.parser.PancakesParser;
import main.parser.symbolTable.Symbol;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

/**
 * Created by adrian on 11/24/15.
 */
public class OpCode {


    private short firstOp;
    private short secondOp;
    private short thirdOp;

    private short size;

    public static final short HALT = 0;

    //Add, substract, multiply, divide
    public static final short iADD = 1;
    public static final short fADD = 2;
    public static final short iSUB = 3;
    public static final short fSUB = 4;
    public static final short iMUL = 5;
    public static final short fMUL = 6;
    public static final short iDIV = 7;
    public static final short fDIV = 8;
    public static final short INTDIV = 8;

    //CONSTANTS
    public static final short bCONST = 0;
    public static final short sCONST = 0;

    //BOOLEAN LOGIC
    public static final short iLT  = 9;
    public static final short fLT  = 10;
    public static final short iEQ  = 11;
    public static final short fEQ  = 12;
    public static final short bEQ  = 12;
    public static final short sEQ  = 12;
    public static final short NOT  = 12;
    public static final short iNEG  = 12;
    public static final short fNEG  = 12;

    //LOGICAL JUMPS
    public static final short GOTO   = 13;
    public static final short GOTOT  = 14;
    public static final short GOTOF  = 15;

    //LOAD AND POP
    public static final short iCONST = 16;
    public static final short fCONST = 17;
    public static final short LOAD   = 18;
    public static final short GLOAD  = 19;
    public static final short POP  = 20;

    //STORE
    public static final short STORE  = 21;
    public static final short GSTORE = 22;

    //FUNCTIONS
    public static final short PRINT  = 23;
    public static final short CALL = 24;
    public static final short RET  = 25;

    public OpCode(short firstOp) {
        this.firstOp = firstOp;
        size = 1;
    }

    public OpCode(short firstOp, short secondOp) {
        this.firstOp = firstOp;
        this.secondOp = secondOp;
        size = 2;
    }

    public OpCode(short firstOp, short secondOp, short thirdOp) {
        this.firstOp = firstOp;
        this.secondOp = secondOp;
        this.thirdOp = thirdOp;
        size = 3;
    }

    public short getFirstOp() {
        return firstOp;
    }

    public void setFirstOp(short firstOp) {
        this.firstOp = firstOp;
    }

    public short getSecondOp() {
        return secondOp;
    }

    public void setSecondOp(short secondOp) {
        this.secondOp = secondOp;
    }

    public short getThirdOp() {
        return thirdOp;
    }

    public void setThirdOp(short thirdOp) {
        this.thirdOp = thirdOp;
    }

    public short getSize() {
        return size;
    }

    //    ArrayList<OpCode> generateByteCode(TerminalNode operation, Symbol.Type type){
//        switch (operation.getSymbol().getType()){
//            case PancakesParser.ADD:
//                if(type == Symbol.Type.tFLOAT){
//                    return fADD;
//                } else{
//                    return iADD;
//                }
//            case PancakesParser.MULT:
//                return
//        }
//
//    }


}
