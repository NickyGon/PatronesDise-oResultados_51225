package intepreter.basic;

public class TerminalExpresionO extends AbstractExpression{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("O")){
            //Interpretacion de la letra/simbolo y lo agregamos al output
            context.output=context.output+4;
            // el borrado de la letra/simbolo ya interpretado en el input
            context.input= context.input.substring(1);
        }
    }
}
