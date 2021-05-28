package builder.ejemplos;

public class I5Pequeno extends Builder{
    @Override
    public void buildMonitor() {
        computadora.setMonitor("24");
    }

    @Override
    public void buildMouse() {
        computadora.setMouse("normal");
    }

    @Override
    public void buildMemoria() {
        computadora.setMemoria("8gb");
    }

    @Override
    public void buildProcesador() {
        computadora.setProcesador("15");
    }

    @Override
    public void buildVideo() {
        computadora.setVideo("4");
    }

    @Override
    public void buildTeclado() {
        computadora.setTeclado("normal");
    }
}
