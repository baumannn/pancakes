package main.pancakes;

import main.parser.*;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.*;
import org.antlr.v4.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.*;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        try {

            PancakesLexer lexer = new PancakesLexer(new ANTLRFileStream("test.pcakes"));
            PancakesParser parser = new PancakesParser(new CommonTokenStream(lexer));

            // Specify our entry point
            PancakesParser.PancakesContext pancakesContext = parser.pancakes();

            // Walk it and attach our listener
            ParseTreeWalker walker = new ParseTreeWalker();
            PancakesMainListener listener = new PancakesMainListener();

            walker.walk(listener, pancakesContext);

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
