package main;

import main.parser.compiler.OpCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by adrian on 11/25/15.
 */
public class Main {

    public static final int STACK_SIZE = 1000;
    public static final int CALL_STACK_SIZE = 1000;
    public static final int FALSE = 0;
    public static final int TRUE = 1;

    // registers
    private static int ip;
    private static int sp = -1;

    private static int[] stack;
    private static int fp;
    private static Integer[] bc;


    public static void main(String[] args) {
        String file;
        if (args.length == 1) {
             file = args[0];


        } else{
            System.err.println("Se usara el nombre por defecto");
            file = "compiled.pcks";
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            ArrayList<Integer> code = (ArrayList<Integer>) in.readObject();
            in.close();

            vm(code);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


    public static void vm(ArrayList<Integer> code){
        stack = new int[STACK_SIZE];
        ip = 0;
        sp = 0;
        fp = 0;

        bc = code.toArray(new Integer[code.size()]);


        int ia, ib, address;
        float fa, fb;
        byte[] bytes;
        char[] sa, sb;

        int inst = bc[ip];
        //ip++; do this inside while
        while (inst != OpCode.HALT && ip < bc.length){
            //////
            System.err.printf("%-35s", disInstr());
            //////



            ip++;
            switch(inst){

                //Add, substract, multiply, divide
                case OpCode.iADD:
                    ia = (int) stack[sp - 1];
                    ib = (int) stack[sp];
                    sp--;
                    stack[sp] = ia + ib;
                    break;
                case OpCode.fADD:
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp-1]).array();
                    fa =  ByteBuffer.wrap(bytes).getFloat();
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp]).array();
                    fb =  ByteBuffer.wrap(bytes).getFloat();
                    sp--;
                    bytes = ByteBuffer.allocate(4).putFloat( fa + fb).array();
                    stack[sp] = ByteBuffer.wrap(bytes).getInt();
                    break;
                case OpCode.iSUB:
                    ia = (int) stack[sp - 1];
                    ib = (int) stack[sp];
                    sp--;
                    stack[sp] = ia - ib;
                    break;
                case OpCode.fSUB:
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp-1]).array();
                    fa =  ByteBuffer.wrap(bytes).getFloat();
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp]).array();
                    fb =  ByteBuffer.wrap(bytes).getFloat();
                    sp--;
                    bytes = ByteBuffer.allocate(4).putFloat( fa - fb).array();
                    stack[sp] = ByteBuffer.wrap(bytes).getInt();
                    break;
                case OpCode.iMUL:
                    ia = (int) stack[sp - 1];
                    ib = (int) stack[sp];
                    sp--;
                    stack[sp] = ia * ib;
                    break;
                case OpCode.fMUL:
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp-1]).array();
                    fa =  ByteBuffer.wrap(bytes).getFloat();
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp]).array();
                    fb =  ByteBuffer.wrap(bytes).getFloat();
                    sp--;
                    bytes = ByteBuffer.allocate(4).putFloat( fa * fb).array();
                    stack[sp] = ByteBuffer.wrap(bytes).getInt();
                    break;
                case OpCode.iDIV:
                    ia = (int) stack[sp - 1];
                    ib = (int) stack[sp];
                    sp--;
                    if(ib == 0){
                        System.err.println("Division entre 0");
                        return;
                    } else{
                        stack[sp] = ia / ib;
                    }
                    break;
                case OpCode.fDIV:
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp-1]).array();
                    fa =  ByteBuffer.wrap(bytes).getFloat();
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp]).array();
                    fb =  ByteBuffer.wrap(bytes).getFloat();
                    sp--;
                    bytes = ByteBuffer.allocate(4).putFloat( fa / fb).array();
                    stack[sp] = ByteBuffer.wrap(bytes).getInt();
                    break;
                case OpCode.INTDIV:
                    break;

                //CONSTANTS
                case OpCode.bCONST:
                    ia = bc[ip];
                    ip++;
                    sp++;
                    stack[sp] = ia;
                    break;
                case OpCode.sCONST:
                    //push string in reverse order
                    //push size
                    address = bc[ip]; //points to size
                    ip++;
                    ia = bc[address]; //size
                    ib = ia; //for the loop
                    while (ib > 0){
                        sp++;
                        stack[sp] = bc[address + ib];
                        ib--;
                    }
                    sp++;
                    stack[sp] = ia;
                    break;

                //BOOLEAN LOGIC
                case OpCode.iLT:
                    ia = stack[sp - 1];
                    ib = stack[sp];
                    sp--;
                    stack[sp] = (ia < ib)? 1 : 0;
                    break;
                case OpCode.fLT:
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp-1]).array();
                    fa =  ByteBuffer.wrap(bytes).getFloat();
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp]).array();
                    fb =  ByteBuffer.wrap(bytes).getFloat();
                    sp--;

                    stack[sp] = (fa < fb)? 1 : 0;
                    break;

                case OpCode.fGT:
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp-1]).array();
                    fa =  ByteBuffer.wrap(bytes).getFloat();
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp]).array();
                    fb =  ByteBuffer.wrap(bytes).getFloat();
                    sp--;

                    stack[sp] = (fa > fb)? 1 : 0;
                    break;
                case OpCode.iGT:
                    ia = stack[sp - 1];
                    ib = stack[sp];
                    sp--;
                    stack[sp] = (ia > ib)? 1 : 0;
                    break;


                case OpCode.bEQ:
                case OpCode.iEQ:
                    ia = stack[sp - 1];
                    ib = stack[sp];
                    sp--;
                    stack[sp] = (ia == ib)? 1 : 0;
                    break;
                case OpCode.fEQ:
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp-1]).array();
                    fa =  ByteBuffer.wrap(bytes).getFloat();
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp]).array();
                    fb =  ByteBuffer.wrap(bytes).getFloat();
                    sp--;

                    stack[sp] = (fa == fb)? 1 : 0;
                    break;
                case OpCode.sEQ:
                    sb = new char[stack[sp]];
                    ia = stack[sp];
                    ib = ia;
                    sp--;
                    while (ia > 0){
                        sb[ib - ia] = (char) stack[sp];
                        sp--;
                        ia--;
                    }
                    ia = stack[sp]; //size string 2
                    sp--;
                    if (ib != ia){
                        sp -= ia; //pop string
                        sp++;
                        stack[sp] = 0; //false
                        break;
                    }

                    ia = 1;
                    for (int i = 0; i < ib; i++) {
                        if(sb[i] != stack[sp]){
                            sp -= ib - i;
                            ia = 0;
                            break;
                        }
                    }
                    sp++;
                    stack[sp] = ia;
                    break;
                case OpCode.NOT:
                    stack[sp] = (stack[sp] == 1)? 0 : 1;
                    break;
                case OpCode.fNEG:
                case OpCode.iNEG:
                    stack[sp] = stack[sp] * -1;
                    break;

                //LOAD AND POP
                case OpCode.iCONST:
                    sp++;
                    stack[sp] = bc[ip++];
                    break;
                case OpCode.fCONST:
                    sp++;
                    stack[sp] = bc[ip];
                    ip++;
                    break;
                case OpCode.LOAD:
                    sp++;
                    stack[sp] = stack[fp + bc[ip]];
                    ip++;
                    break;
                case OpCode.GLOAD:
                    sp++;
                    stack[sp] = bc[bc[ip]];
                    ip++;
                    break;
                case OpCode.POP:
                    sp--;
                    break;

                //STORE
                case OpCode.STORE:
                    stack[fp + bc[ip]] = stack[sp];
                    sp--;
                    ip++;
                    break;
                case OpCode.GSTORE:
                    bc[bc[ip]] = stack[sp];
                    sp--;
                    ip++;
                    break;


                //FUNCTIONS
                case OpCode.sPRINT:
                    ia = stack[sp];
                    sp--;
                    StringBuffer sbuff = new StringBuffer();
                    while (ia > 0){
                        sbuff.append((char) stack[sp]);
                        sp--;
                        ia--;
                    }
                    System.out.print(sbuff.toString());
                    break;

                case OpCode.iPRINT:
                    ia = stack[sp];
                    sp--;
                    System.out.print(ia);
                    break;
                case OpCode.fPRINT:
                    bytes = ByteBuffer.allocate(4).putInt(stack[sp]).array();
                    sp--;
                    fa =  ByteBuffer.wrap(bytes).getFloat();
                    System.out.print(fa);
                    break;

                //LOGICAL JUMPS
                case OpCode.GOTO:
                    ip = bc[ip];//advance ip?

                    break;
                case OpCode.GOTOT:
                    address = bc[ip];//advance ip?
                    ia = stack[sp];
                    sp--;
                    if (ia == 1){
                        ip = address;
                    }
                    break;
                case OpCode.GOTOF:
                    address = bc[ip++]; //advance ip?
                    ia = stack[sp];
                    sp--;
                    if (ia == 0){
                        ip = address;
                    }
                    break;

                case OpCode.CALL:
                    //set up call frame

                    address = bc[ip]; //func address
                    ip++;

                    sp++;
                    stack[sp] = bc[ip]; //number of args
                    ip++;

                    sp++;
                    stack[sp] = fp; //save fp

                    sp++;
                    stack[sp] = ip; //return address

                    fp = sp;    // fp points to return address
                    ip = address;

                    break;
                case OpCode.RET:
                    ia = stack[sp]; //save return value for now
                    sp--;

                    sp = fp;    //reset sp to fp (pop stack until reaching fp)

                    ip = stack[sp]; //restore ip, go to return address
                    sp--;

                    fp = stack[sp];      // restore fp
                    sp--;

                    ib = stack[sp]; //find # of args, pop args
                    sp--;

                    sp -= ib;    // pop #ib of args
                    sp++;
                    stack[sp] = ia; // restore result to stack
                    break;



            }//end switch
            //////
            System.err.println(stackString());
            /////

            inst = bc[ip];



        }
        System.err.printf("%-35s", disInstr());
        System.err.println(stackString());
        dumpDataMemory();

    }


    protected static String stackString() {
        StringBuilder buf = new StringBuilder();
        buf.append("stack=[");
        for (int i = 0; i <= sp; i++) {
            int o = stack[i];
            buf.append(" ");
            buf.append(o);
        }
        buf.append(" ]");
        return buf.toString();
    }

    protected static String disInstr() {
        int opcode = bc[ip];
        String opName = OpCode.translateOpCode(opcode);
        StringBuilder buf = new StringBuilder();
        buf.append(String.format("%04d:\t%-11s", ip, opName));
        int nargs = OpCode.numberOfOperands(opcode);
        if ( nargs>0 ) {
            List<String> operands = new ArrayList<String>();
            for (int i=ip+1; i<=ip+nargs; i++) {
                operands.add(String.valueOf(bc[i]));
            }
            for (int i = 0; i<operands.size(); i++) {
                String s = operands.get(i);
                if ( i>0 ) buf.append(", ");
                buf.append(s);
            }
        }
        return buf.toString();
    }

    protected static void dumpDataMemory() {
        System.err.println("Data memory:");
        int addr = 0;
        for (int i = 0; i < 20; i++) {
            System.err.printf("%s\t%s", i, bc[i]);
        }
        System.err.println();
    }


}
