package intepreter.basic;

public class TerminalExpresionA extends AbstractExpression{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("A")){
            //Interpretacion de la letra/simbolo y lo agregamos al output
            context.output=context.output+1;
            // el borrado de la letra/simbolo ya interpretado en el input
            context.input= context.input.substring(1);
        }
    }
}
