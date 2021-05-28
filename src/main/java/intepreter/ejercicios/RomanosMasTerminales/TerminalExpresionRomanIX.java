package intepreter.ejercicios.RomanosMasTerminales;

public class TerminalExpresionRomanIX extends AbstractExpression {
    public TerminalExpresionRomanIX(int amountDigit) {
        this.amountDigit=amountDigit;
    }

    @Override
    public void interpreter(ContextRomanNumero context) {
        context.output=context.output+"IX";
        context.input=context.input.substring(this.amountDigit);
    }
}
