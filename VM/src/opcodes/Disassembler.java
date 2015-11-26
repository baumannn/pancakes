package opcodes;

import java.util.ArrayList;

/**
 * Created by adrian on 11/25/15.
 */
public class Disassembler {

    private void translate(int startCode, ArrayList<Integer> mfo) {
        for (int i = startCode; i < mfo.size(); i++) {
            System.out.print(transOp(mfo.get(i)) + "\t");
            int numOpers = numberOfOperands(mfo.get(i));
            for (int j = 0; j < numOpers; j++){
                i++;
                    System.out.print(mfo.get(i) + " ");

            }

            while ( (3 - numOpers) >= 0){
                System.out.print("\t");
                numOpers++;
            }

            System.out.println("// " + i);


        }
    }

    private int numberOfOperands(Integer opcode) {
        switch(opcode){


            case OpCode.HALT:
                return 0;

            //Add, substract, multiply, divide
            case OpCode.iADD:
                return 0;
            case OpCode.fADD:
                return 0;
            case OpCode.iSUB:
                return 0;
            case OpCode.fSUB:
                return 0;
            case OpCode.iMUL:
                return 0;
            case OpCode.fMUL:
                return 0;
            case OpCode.iDIV:
                return 0;
            case OpCode.fDIV:
                return 0;
            case OpCode.INTDIV:
                return 0;

            //CONSTANTS
            case OpCode.bCONST:
                return 1;
            case OpCode.sCONST:
                return 1;

            //BOOLEAN LOGIC
            case OpCode.iLT:
                return 0;
            case OpCode.fLT:
                return 0;
            case OpCode.iEQ:
                return 0;
            case OpCode.fEQ:
                return 0;
            case OpCode.bEQ:
                return 0;
            case OpCode.sEQ:
                return 0;
            case OpCode.NOT:
                return 0;
            case OpCode.iNEG:
                return 0;
            case OpCode.fNEG:
                return 0;

            //LOGICAL JUMPS
            case OpCode.GOTO:
                return 1;
            case OpCode.GOTOT:
                return 1;
            case OpCode.GOTOF:
                return 1;

            //LOAD AND POP
            case OpCode.iCONST:
                return 1;
            case OpCode.fCONST:
                return 1;
            case OpCode.LOAD:
                return 1;
            case OpCode.GLOAD:
                return 1;
            case OpCode.POP:
                return 0;

            //STORE
            case OpCode.STORE:
                return 1;
            case OpCode.GSTORE:
                return 1;

            //FUNCTIONS
            case OpCode.PRINT:
                return 0;
            case OpCode.CALL:
                return 2;
            case OpCode.RET:
                return 0;

        }

        return 0;
    }

    private String transOp(int opcode){


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
            case OpCode.PRINT:
                return "PRINT";
            case OpCode.CALL:
                return "CALL";
            case OpCode.RET:
                return "RET";

        }
        return "Error";
    }

}
