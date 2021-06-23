package bridge.ejemplo.bridge;



public class Circulo implements iFigura{
    private int radio;
    private iColor color;

    public Circulo(iColor color){this.color=color;}
    public Circulo(int radio){
        this.radio=radio;
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
