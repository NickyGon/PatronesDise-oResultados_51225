package intepreter.basic;

public class TerminalExpresionI extends AbstractExpression{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("I")){
            //Interpretacion de la letra/simbolo y lo agregamos al output
            context.output=context.output+3;
            // el borrado de la letra/simbolo ya interpretado en el input
            context.input= context.input.substring(1);
        }
    }
}
