package intepreter.ejemplo;

public class TerminalExpresionNumber extends AbstractExpression{

    public TerminalExpresionNumber(int amountDigit){
        this.amountDigit=amountDigit;
    }

    @Override
    public void interpreter(ContextOperacionArit context) {
        context.output=context.output + (Integer.parseInt(context.input.substring(0,this.amountDigit))*context.signo);
        context.input= context.input.substring(this.amountDigit);
    }
}
