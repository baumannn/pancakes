package main.parser.compiler;

import main.parser.symbolTable.Symbol;

/**
 * Created by adrian on 11/24/15.
 */
public class OpCode {



    public static final int HALT = 0;

    //Add, substract, multiply, divide
    public static final int iADD = 1;
    public static final int fADD = 2;
    public static final int iSUB = 3;
    public static final int fSUB = 4;
    public static final int iMUL = 5;
    public static final int fMUL = 6;
    public static final int iDIV = 7;
    public static final int fDIV = 8;
    public static final int INTDIV = 9;

    //CONSTANTS
    public static final int bCONST = 10;
    public static final int sCONST = 11;

    //BOOLEAN LOGIC
    public static final int iLT  = 12;
    public static final int fLT  = 13;
    public static final int fGT = 36;
    public static final int iGT = 37;


    public static final int iEQ  = 14;
    public static final int fEQ  = 15;
    public static final int bEQ  = 16;
    public static final int sEQ  = 17;
    public static final int NOT  = 18;
    public static final int iNEG  = 19;
    public static final int fNEG  = 20;

    //LOGICAL JUMPS
    public static final int GOTO   = 21;
    public static final int GOTOT  = 22;
    public static final int GOTOF  = 23;

    //LOAD AND POP
    public static final int iCONST = 24;
    public static final int fCONST = 25;
    public static final int LOAD   = 26;
    public static final int oLOAD   = 38;
    public static final int GLOAD  = 27;
    public static final int POP  = 28;

    //STORE
    public static final int STORE  = 29;
    public static final int GSTORE = 30;

    //FUNCTIONS
    public static final int sPRINT  = 31;
    public static final int fPRINT  = 32;
    public static final int iPRINT  = 33;
    public static final int CALL = 34;
    public static final int RET  = 35;





    public static String translateOpCode(int opcode){


            switch(opcode){


                case OpCode.HALT:
                    return "HALT";

                //Add, substract, multiply, divide
                case OpCode.iADD:
                    return "iADD";
                case OpCode.fADD:
                    return "fADD";
                case OpCode.iSUB:
                    return "iSUB";
                case OpCode.fSUB:
                    return "fSUB";
                case OpCode.iMUL:
                    return "iMUL";
                case OpCode.fMUL:
                    return "fMUL";
                case OpCode.iDIV:
                    return "iDIV";
                case OpCode.fDIV:
                    return "fDIV";
                case OpCode.INTDIV:
                    return "INTDIV";

                //CONSTANTS
                case OpCode.bCONST:
                    return "bCONST";
                case OpCode.sCONST:
                    return "sCONST";

                //BOOLEAN LOGIC
                case OpCode.iLT:
                    return "iLT";
                case OpCode.fLT:
                    return "fLT";
                case OpCode.iGT:
                    return "iGT";
                case OpCode.fGT:
                    return "fGT";
                case OpCode.iEQ:
                    return "iEQ";
                case OpCode.fEQ:
                    return "fEQ";
                case OpCode.bEQ:
                    return "bEQ";
                case OpCode.sEQ:
                    return "sEQ";
                case OpCode.NOT:
                    return "NOT";
                case OpCode.iNEG:
                    return "iNEG";
                case OpCode.fNEG:
                    return "fNEG";

                //LOGICAL JUMPS
                case OpCode.GOTO:
                    return "GOTO";
                case OpCode.GOTOT:
                    return "GOTOT";
                case OpCode.GOTOF:
                    return "GOTOF";

                //LOAD AND POP
                case OpCode.iCONST:
                    return "iCONST";
                case OpCode.fCONST:
                    return "fCONST";
                case OpCode.LOAD:
                    return "LOAD";
                case OpCode.oLOAD:
                    return "oLOAD";
                case OpCode.GLOAD:
                    return "GLOAD";
                case OpCode.POP:
                    return "POP";

                //STORE
                case OpCode.STORE:
                    return "STORE";
                case OpCode.GSTORE:
                    return "GSTORE";

                //FUNCTIONS
                case OpCode.sPRINT:
                    return "sPRINT";
                case OpCode.fPRINT:
                    return "fPRINT";
                case OpCode.iPRINT:
                    return "iPRINT";
                case OpCode.CALL:
                    return "CALL";
                case OpCode.RET:
                    return "RET";

            }
            return "Error" + opcode;
    }


    public static int numberOfOperands(int opcode) {
        switch(opcode){


            case OpCode.HALT:
                //Add, substract, multiply, divide
            case OpCode.iADD:
            case OpCode.fADD:
            case OpCode.iSUB:
            case OpCode.fSUB:
            case OpCode.iMUL:
            case OpCode.fMUL:
            case OpCode.iDIV:
            case OpCode.fDIV:
            case OpCode.INTDIV:
                //BOOLEAN LOGIC
            case OpCode.iLT:
            case OpCode.iGT:
            case OpCode.fLT:
            case OpCode.fGT:
            case OpCode.iEQ:
            case OpCode.fEQ:
            case OpCode.bEQ:
            case OpCode.sEQ:
            case OpCode.NOT:
            case OpCode.iNEG:
            case OpCode.fNEG:
                //POP
            case OpCode.POP:
                //return
            case OpCode.RET:
                return 0;

            //CONSTANTS
            case OpCode.bCONST:
            case OpCode.sCONST:
                //LOGICAL JUMPS
            case OpCode.GOTO:
            case OpCode.GOTOT:
            case OpCode.GOTOF:
                //LOAD
            case OpCode.iCONST:
            case OpCode.fCONST:
            case OpCode.LOAD:
            case OpCode.oLOAD:
            case OpCode.GLOAD:
                //STORE
            case OpCode.STORE:
            case OpCode.GSTORE:
                //BUILT IN FUNCTIONS
            case OpCode.sPRINT:
            case OpCode.fPRINT:
            case OpCode.iPRINT:
                return 1;
            case OpCode.CALL:
                return 2;


        }

        return 0;
    }






//    private Symbol symbol = null;
//    private int firstOp;
//    private int secondOp;
//    private int thirdOp;
//
//    private int size;

//    public OpCode(int firstOp) {
//        this.firstOp = firstOp;
//        size = 1;
//    }
//
//    public OpCode(int firstOp, int secondOp) {
//        this.firstOp = firstOp;
//        this.secondOp = secondOp;
//        size = 2;
//    }
//
//    public OpCode(int firstOp, Symbol secondOp) {
//        this.firstOp = firstOp;
//        this.symbol = secondOp;
//        size = 2;
//    }
//
//    public OpCode(int firstOp, int secondOp, int thirdOp) {
//        this.firstOp = firstOp;
//        this.secondOp = secondOp;
//        this.thirdOp = thirdOp;
//        size = 3;
//    }
//    public OpCode(int firstOp, Symbol symbol, int thirdOp) {
//        this.firstOp = firstOp;
//        this.symbol = symbol;
//        this.secondOp = secondOp;
//        this.thirdOp = thirdOp;
//        size = 3;
//    }
//
//    public int getFirstOp() {
//        return firstOp;
//    }
//
//    public void setFirstOp(int firstOp) {
//        this.firstOp = firstOp;
//    }
//
//    public int getSecondOp() {
//        return secondOp;
//    }
//
//    public void setSecondOp(int secondOp) {
//        this.secondOp = secondOp;
//    }
//
//    public int getThirdOp() {
//        return thirdOp;
//    }
//
//    public void setThirdOp(int thirdOp) {
//        this.thirdOp = thirdOp;
//    }
//
//    public int getSize() {
//        return size;
//    }




}
