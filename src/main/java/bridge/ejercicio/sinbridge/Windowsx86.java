package bridge.ejercicio.sinbridge;

public class Windowsx86 extends Windows{

    @Override
    public void arquitectura() {
        System.out.println("x86");
    }

    @Override
    public void paint() {
        System.out.println("Se ejecuta Paint");
    }

    @Override
    public void nombre() {
        System.out.println("x67");
    }

    @Override
    public void reproductor() {
        System.out.println("Reproducir");
    }

    //Si queremos incluir un Windows que reproduzca musica (otra arquitectura, y no Linux), aqui hay lío.
}
