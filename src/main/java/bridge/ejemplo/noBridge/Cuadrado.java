package bridge.ejemplo.noBridge;

public class Cuadrado implements Figure{
    private int tamanolados;

    public Cuadrado(int tamanoLado){
        this.tamanolados=tamanoLado;
    }
    @Override
    public void pintarAzul() {
        System.out.println("Pintando de Azul");
    }

    @Override
    public void pintarRojo() {
        System.out.println("Pintando de Rojo");
    }

    @Override
    public void pintarAmarillo() {
        System.out.println("Pintando de Amarillo");
    }

    @Override
    public void pintarMorado() {

    }

    @Override
    public void pintarCafe() {

    }

    @Override
    public int getArea() {
        return 0;
    }
}
