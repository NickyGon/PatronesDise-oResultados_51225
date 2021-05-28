package intepreter.basic;

public class TerminalExpresionE extends AbstractExpression{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("E")){
            //Interpretacion de la letra/simbolo y lo agregamos al output
            context.output=context.output+2;
            // el borrado de la letra/simbolo ya interpretado en el input
            context.input= context.input.substring(1);
        }
    }
}
