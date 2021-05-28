package intepreter.ejercicios.RomanosMasTerminales;

public class TerminalExpresionRomanX extends AbstractExpression {
    public TerminalExpresionRomanX(int amountDigit) {
        this.amountDigit=amountDigit;
    }

    @Override
    public void interpreter(ContextRomanNumero context) {
        context.output=context.output+"X";
        context.input=context.input.substring(this.amountDigit);
    }
}
