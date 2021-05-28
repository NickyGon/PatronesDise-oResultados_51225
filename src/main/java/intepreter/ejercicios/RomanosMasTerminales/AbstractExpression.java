package intepreter.ejercicios.RomanosMasTerminales;

public abstract class AbstractExpression {
    public int amountDigit;
    public abstract void interpreter(ContextRomanNumero context);
}
