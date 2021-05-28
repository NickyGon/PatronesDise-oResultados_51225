package intepreter.ejercicios.RomanosMasTerminales;

public class TerminalExpresionRomanI extends AbstractExpression {
    public TerminalExpresionRomanI(int amountDigit) {
       this.amountDigit=amountDigit;
    }

    @Override
    public void interpreter(ContextRomanNumero context) {
        for (int i=0;i<Integer.parseInt(context.input.substring(0,this.amountDigit));i++){
            context.output=context.output+"I";
        }
        context.input= context.input.substring(this.amountDigit);
    }
}
