package ejercicios.UserStory;

public class TerminalExpressionGiven extends AbstractExpression{

    public TerminalExpressionGiven(int amountChars){
        this.amountChars=amountChars;
    }

    @Override
    public void interpreter(ContextUserStory context) {
            context.output=context.output+"Given";
            context.input= context.input.substring(amountChars);
    }
}
