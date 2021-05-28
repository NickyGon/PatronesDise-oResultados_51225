package ejercicios.UserStory;

public class TerminalExpressionWhen extends AbstractExpression{

    public TerminalExpressionWhen(int amountChars){
        this.amountChars=amountChars;
    }

    @Override
    public void interpreter(ContextUserStory context) {
            context.output=context.output+"When";
            context.input= context.input.substring(amountChars);
    }
}
