package main.pancakes;

import main.parser.*;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;
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



            parser.getB
            DOTTreeGenerator gen = new DOTTreeGenerator();

            StringTemplate st = gen.toDOT(tree);
            System.out.println(st);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
