package ejercicios.UserStory;

public class TerminalExpressionWord extends AbstractExpression{

    public TerminalExpressionWord(int amountChars){
        this.amountChars=amountChars;
    }

    @Override
    public void interpreter(ContextUserStory context) {
            context.output=context.output+context.input.substring(0,amountChars);
            context.input= context.input.substring(amountChars);
    }
}
