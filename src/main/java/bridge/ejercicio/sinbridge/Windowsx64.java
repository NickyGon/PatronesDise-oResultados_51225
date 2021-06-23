package bridge.ejercicio.sinbridge;

public class Windowsx64 extends Windows{

    @Override
    public void arquitectura() {
        System.out.println("x64");
    }

    @Override
    public void paint() {

    }

    @Override
    public void nombre() {
        System.out.println("Windows");
    }

    @Override
    public void reproductor() {
        System.out.println("Reproducir");
    }


}
