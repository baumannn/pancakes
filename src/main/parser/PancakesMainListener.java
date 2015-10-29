package main.parser;

import java.util.HashMap;

/**
 * Created by adrian on 10/28/15.
 */
public class PancakesMainListener extends PancakesBaseListener {

    HashMap<String, String> currentContext;
    ??? scopes = new ???(); //HashMap

    @Override
    public void enterPancakes(PancakesParser.PancakesContext ctx) {
        currentScope = new HashMap<String, String>();
        scopes.set(ctx, currentScope);
        scopeStack.push(globalScope)
    }

    @Override
    public void enterVar_declaration(PancakesParser.Var_declarationContext ctx) {
        varDeclarations = getScope();
        varDeclarations.set(var, whatevs);
    }

    private HashMap<String, String> getScope(){

        return currentContext;

    }

    private void pushScope(ctx){

        scopeStack.push(currentContext.get(context))
        currentContext = new HashMap<>();
    }

}
