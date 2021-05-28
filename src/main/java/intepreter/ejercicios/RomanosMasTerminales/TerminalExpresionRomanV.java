package intepreter.ejercicios.RomanosMasTerminales;

public class TerminalExpresionRomanV extends AbstractExpression {
    public TerminalExpresionRomanV(int amountDigit) {
        this.amountDigit=amountDigit;
    }

    @Override
    public void interpreter(ContextRomanNumero context) {
        context.output=context.output+"V";
        for (int i=0;i<Integer.parseInt(context.input.substring(0,this.amountDigit))-5;i++){
            context.output=context.output+"I";
        }
        context.input=context.input.substring(this.amountDigit);
    }
}
