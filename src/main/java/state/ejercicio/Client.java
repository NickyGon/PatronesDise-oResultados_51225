package state.ejercicio;

public class Client {
    public static void main(String[]args){
        iEstadoComputadora state1= new Apagado();
        Computadora computadora=new Computadora();

        String[] program={"Nixon","Word","Nino","YouTube","i","p","Nixon","Word","Nino","YouTube","i","p","Nixon","Word","Nino","YouTube","Nina","Steam","Powerpoint","Point"};

        computadora.setProgramas(program);
        computadora.setState(state1);
        computadora.request();

        state1=new Prendido();
        computadora.setState(state1);
        computadora.request();

        state1=new Reiniciando();
        computadora.setState(state1);
        computadora.request();

    }
}
