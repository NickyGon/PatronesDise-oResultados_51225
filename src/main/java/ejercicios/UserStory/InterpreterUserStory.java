package ejercicios.UserStory;

import java.util.ArrayList;
import java.util.List;

public class InterpreterUserStory extends ejercicios.UserStory.AbstractExpression {
    private List<AbstractExpression> parseTree= new ArrayList<>();
    private ContextUserStory context;

    public InterpreterUserStory(String word){this.interpretecion(word);}


    public void interpretecion(String words){
        String input = words;
        context= new ContextUserStory(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "Como":
                    parseTree.add(new TerminalExpressionGiven(word.length()));
                    break;
                case "Quiero":
                    parseTree.add(new TerminalExpressionWhen(word.length()));
                    break;
                case "Para":
                    parseTree.add(new TerminalExpressionThen(word.length()));
                    break;
                default:
                    parseTree.add(new TerminalExpressionWord(word.length()));
                    break;
            }

        }
    }

    public String interpretar(){
        for(AbstractExpression terminalExpresion: parseTree){
            terminalExpresion.interpreter(context);
            context.output=context.output+" ";
        }
        return context.output;
    }
    @Override
    public void interpreter(ContextUserStory context) {

    }
}
