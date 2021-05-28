package intepreter.ejercicios.RomanosUnTerminal;

import java.util.ArrayList;
import java.util.List;

public class InterpreterRomanos extends AbstractExpression{
    private List<AbstractExpression> parseTree= new ArrayList<>();
    private ContextRomanNumero context;

    public InterpreterRomanos(String word){this.interpection(word);}

    private void interpection(String words) {
        String input=words;
        context= new ContextRomanNumero(input.replace(" ",""));

        for (String s:input.split(" ")) {
            parseTree.add(new TerminalExpresionNumber(s.length()));
        }
    }

    public String interpretar(){
        for (AbstractExpression terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(ContextRomanNumero context) {

    }
}
