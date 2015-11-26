package opcodes;

import java.util.ArrayList;
import main.parser.compiler.OpCode;

/**
 * Created by adrian on 11/25/15.
 */
public class Disassembler {

    private void translate(int startCode, ArrayList<Integer> mfo) {
        for (int i = startCode; i < mfo.size(); i++) {
            System.out.print(OpCode.translateOpCode(mfo.get(i)) + "\t");
            int numOpers = OpCode.numberOfOperands(mfo.get(i));
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

}
