package intepreter.ejercicios.RomanosMasTerminales;

public class TerminalExpresionRomanIV extends AbstractExpression {
    public TerminalExpresionRomanIV(int amountDigit) {
        this.amountDigit=amountDigit;
    }

    @Override
    public void interpreter(ContextRomanNumero context) {
        context.output=context.output+"IV";
        context.input=context.input.substring(this.amountDigit);


    }
}
