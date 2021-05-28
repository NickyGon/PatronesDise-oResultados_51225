package intepreter.ejercicios.RomanosUnTerminal;

public class TerminalExpresionNumber extends AbstractExpression {

    public TerminalExpresionNumber(int amountDigit) {
        this.amountDigit = amountDigit;
    }


    @Override
    public void interpreter(ContextRomanNumero context) {
        context.output = context.output + roman(Integer.parseInt(context.input.substring(0, amountDigit))) + " ";
        context.input = context.input.substring(this.amountDigit);
    }

    public String roman(int entry) {
        String term = "";
        String[] terminals = {"X", "IX", "V", "IV", "I"};
        int[] value = {10, 9, 5, 4, 1};
        for (int i = 0; i < terminals.length; i++) {
            while (entry >= value[i]) {
                entry = entry - value[i];
                term = term + terminals[i];

            }

        }
        return term;
    }
}
