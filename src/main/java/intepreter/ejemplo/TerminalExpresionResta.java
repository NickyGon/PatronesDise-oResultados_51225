package intepreter.ejemplo;

public class TerminalExpresionResta extends AbstractExpression{

    public TerminalExpresionResta(int amountDigit){
        this.amountDigit=amountDigit;
    }

    @Override
    public void interpreter(ContextOperacionArit context) {
        if (context.input.startsWith("-")){
            context.signo=-1;
            context.input=context.input.substring(this.amountDigit);
        }
    }
}
