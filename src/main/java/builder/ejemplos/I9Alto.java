package builder.ejemplos;

public class I9Alto extends Builder{
    @Override
    public void buildMonitor() {
        computadora.setMonitor("45");
    }

    @Override
    public void buildMouse() {
        computadora.setMouse("gamer");
    }

    @Override
    public void buildMemoria() {
        computadora.setMemoria("32gb");
    }

    @Override
    public void buildProcesador() {
        computadora.setProcesador("19");
    }

    @Override
    public void buildVideo() {
        computadora.setVideo("16");
    }

    @Override
    public void buildTeclado() {
        computadora.setTeclado("Luminos");
    }
}
