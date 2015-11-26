package opcodes;

/**
 * Created by adrian on 11/25/15.
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
    public static final int GLOAD  = 27;
    public static final int POP  = 28;

    //STORE
    public static final int STORE  = 29;
    public static final int GSTORE = 30;

    //FUNCTIONS
    public static final int PRINT  = 31;
    public static final int CALL = 32;
    public static final int RET  = 33;
}
