package main.pancakes;

import main.parser.generated.PancakesLexer;
import main.parser.generated.PancakesParser;
import main.parser.semanticAnalysis.FirstPassPancakesListener;
import main.parser.semanticAnalysis.SecondPassPancakesListener;
import main.parser.semanticAnalysis.ThirdPassPancakesListener;
import main.parser.symbolTable.Symbol;
import main.parser.compiler.TranslationFirstPhase;
import main.parser.compiler.TranslationSecondPhase;
import main.parser.compiler.TranslationThirdPhase;
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
                //FourthPassPancakesListener listener_4 = new FourthPassPancakesListener(listener_1.getGlobals(), listener_1.getScopes(), listener_3.getTypeMap());
                //walker.walk(listener_4, pancakesContext);
            if (pass_error){ return;}
            TranslationFirstPhase listener_mp = new TranslationFirstPhase();
            walker.walk(listener_mp, pancakesContext);

            TranslationSecondPhase msp = new TranslationSecondPhase(listener_1.getGlobals(), listener_mp.getMfo(), listener_mp.getIp());
            walker.walk(msp, pancakesContext);

            //(GlobalScope globalScope, ParseTreeProperty<Scope> scopes, ArrayList<Byte> mfo, int ip, HashMap<Symbol, Integer> varReferences, HashMap<Symbol, Integer> fConst, HashMap<Symbol, Integer> sConst) {

            TranslationThirdPhase mtp = new TranslationThirdPhase(listener_1.getGlobals(), listener_1.getScopes(), msp.getMfo(), msp.getIp(), msp.getVarReferences(), listener_mp.getfConstants(), listener_mp.getsConstants(), listener_3.getTypeMap());
            walker.walk(mtp, pancakesContext);
               // AddressUpdater au = new AddressUpdater(listener_4);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
