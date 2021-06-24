package composite.ejercicio;

public class Computadora extends ArtefactosElectronicos {
    public Computadora(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void operation() {
        System.out.println("Mostrando computadora...");
        this.info();
    }

    @Override
    public void add(ArtefactosElectronicos component) {
        System.out.println("No aplicable");
    }

    @Override
    public void remove(ArtefactosElectronicos component) {
        System.out.println("No aplicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No aplicable");
    }
}
