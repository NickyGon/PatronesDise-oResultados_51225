package bridge.ejemplo.bridge;



public class Cuadrado implements iFigura{
    private int tamanolados;
    private iColor color;

    public Cuadrado(iColor color){this.color=color;}
    public Cuadrado(int tamanoLado){
        this.tamanolados=tamanoLado;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void pintar() {
        System.out.println("Pintando como color ");
        color.pintar();
    }
}
