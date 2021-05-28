package intepreter.ejercicios.RomanosMasTerminales;


import java.util.ArrayList;
import java.util.List;

public class InterpreterRomanos extends AbstractExpression {
    private List<AbstractExpression> parseTree= new ArrayList<>();
    private ContextRomanNumero context;

    public InterpreterRomanos(String word){this.interpection(word);}

    private void interpection(String words) {
        String input=words;
        context= new ContextRomanNumero(input.replace(" ",""));
        for (String s:input.split(" ")) {
            if (Integer.parseInt(s)<4){
                parseTree.add(new TerminalExpresionRomanI(s.length()));
            } else if (Integer.parseInt(s)==4){
                parseTree.add(new TerminalExpresionRomanIV(s.length()));
            } else if (Integer.parseInt(s)>=5 && Integer.parseInt(s)<9) {
                parseTree.add(new TerminalExpresionRomanV(s.length()));
            } else if (Integer.parseInt(s)==9){
                parseTree.add(new TerminalExpresionRomanIX(s.length()));
            } else if (Integer.parseInt(s)>=10){
                parseTree.add(new TerminalExpresionRomanX(s.length()));
            }
        }
    }

    public String interpretar(){
        for (AbstractExpression terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
            context.output=context.output+" ";
        }
        return context.output;
    }

    @Override
    public void interpreter(ContextRomanNumero context) {

    }
}
