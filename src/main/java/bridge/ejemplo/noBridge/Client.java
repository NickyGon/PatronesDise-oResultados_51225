package bridge.ejemplo.noBridge;

public class Client {
    public static void main(String[]args){
        Figure cuadrado= new Cuadrado(5);
        cuadrado.pintarAzul();
        cuadrado.pintarAmarillo();
        cuadrado.pintarRojo();
    }
}
