package state.ejemplo;

public class Client {
    public static void main(String[]args){
        iEstadoComputadora state=new Apagado();
        Computadora computadora=new Computadora();

        computadora.setState(state);
        computadora.request();

        state=new EncendidoMinando("Minando criptosegundos");
        computadora.setTimeLimit(20);
        computadora.setState(state);
        computadora.request();

        state=new EncendidoPrograma("Chrome");
        computadora.setState(state);
        computadora.request();

    }
}
