package ejercicios.UserStory;

public class TerminalExpressionThen extends AbstractExpression{

    public TerminalExpressionThen(int amountChars){
        this.amountChars=amountChars;
    }

    @Override
    public void interpreter(ContextUserStory context) {
            context.output=context.output+"Then";
            context.input= context.input.substring(amountChars);
    }
}
