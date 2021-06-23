package bridge.ejemplo.bridge;



public class Triangulo implements iFigura{
    private int lado;
    private iColor color;

    public Triangulo(iColor color){this.color=color;}
    public Triangulo(int lado){
        this.lado =lado;
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
