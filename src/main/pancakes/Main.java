package main.pancakes;

import main.parser.*;

import main.parser.symbolTable.Symbol;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;


public class Main {

    private static boolean pass_error = false;

    public static Symbol.Type getType(int typeToken){
        switch (typeToken){
            case PancakesParser.T_BOOL : return Symbol.Type.tBOOL;
            case PancakesParser.T_INT : return Symbol.Type.tINT;
            case PancakesParser.T_FLOAT : return Symbol.Type.tFLOAT;
            case PancakesParser.T_STRING : return Symbol.Type.tSTRING;
            case PancakesParser.T_VOID: return Symbol.Type.tVOID;
            default : return Symbol.Type.tINVALID;
        }
    }

    public static void logError(Token t, String msg) {
        pass_error = true;
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                msg);
    }

    public static void main(String[] args) {

        try {

            PancakesLexer lexer = new PancakesLexer(new ANTLRFileStream("test.pcakes"));
            PancakesParser parser = new PancakesParser(new CommonTokenStream(lexer));

            // Specify our entry point
            PancakesParser.PancakesContext pancakesContext = parser.pancakes();

            // Walk it and attach our listener
            ParseTreeWalker walker = new ParseTreeWalker();
            FirstPassPancakesListener listener_1 = new FirstPassPancakesListener();
            walker.walk(listener_1, pancakesContext);
            if(pass_error){ return; }
                SecondPassPancakesListener listener_2  = new SecondPassPancakesListener( listener_1.getGlobals(), listener_1.getScopes());
                walker.walk(listener_2, pancakesContext);

            if(pass_error){ return;}
                ThirdPassPancakesListener listener_3 = new ThirdPassPancakesListener( listener_1.getGlobals(), listener_1.getScopes());
                walker.walk(listener_3, pancakesContext);

            if (pass_error){ return;}
                FourthPassPancakesListener listener_4 = new FourthPassPancakesListener(listener_1.getGlobals(), listener_1.getScopes(), listener_3.getTypeMap());
                walker.walk(listener_4, pancakesContext);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
