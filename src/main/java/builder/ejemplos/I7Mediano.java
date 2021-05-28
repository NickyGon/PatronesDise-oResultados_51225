package builder.ejemplos;

public class I7Mediano extends Builder{
    @Override
    public void buildMonitor() {
        computadora.setMonitor("32");
    }

    @Override
    public void buildMouse() {
        computadora.setMouse("Luminos");
    }

    @Override
    public void buildMemoria() {
        computadora.setMemoria("16gb");
    }

    @Override
    public void buildProcesador() {
        computadora.setProcesador("17");
    }

    @Override
    public void buildVideo() {
        computadora.setVideo("8");
    }

    @Override
    public void buildTeclado() {
        computadora.setTeclado("Luminos");
    }
}
