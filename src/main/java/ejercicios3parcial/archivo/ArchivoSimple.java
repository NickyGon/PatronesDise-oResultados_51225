package ejercicios3parcial.archivo;

public class ArchivoSimple extends Archivo{

    public ArchivoSimple(String nombre, String extension, String cuerpo) {
        super(nombre, extension, cuerpo);
    }

    @Override
    public void operation() {
        System.out.println("Mostrando archivo");
        this.info();
    }

    @Override
    public void addArchivo(Archivo archivo) {
        System.out.println("No aplicable");
    }

    @Override
    public void remove(Archivo archivo) {
        System.out.println("No aplicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No aplicable");
    }
}
