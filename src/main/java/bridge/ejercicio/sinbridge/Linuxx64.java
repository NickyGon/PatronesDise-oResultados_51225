package bridge.ejercicio.sinbridge;

public class Linuxx64 extends Linux{
    @Override
    public void arquitectura() {
        System.out.println("x64");
    }

    @Override
    public void nombre() {
        System.out.println("Linux");
    }

    @Override
    public void reproductor() {

    }
}
