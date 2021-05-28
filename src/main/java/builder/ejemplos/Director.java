package builder.ejemplos;

public class Director {
    private Builder builder;
    public Computadora getComputadora(){
        return builder.getComputadora();
    }

    public void setBuilder(Builder builder){
        this.builder=builder;
    }

    public void buildComputadora(){
        this.builder.createComputadora();
        this.builder.buildMonitor();
        this.builder.buildMouse();
        this.builder.buildMemoria();
        this.builder.buildProcesador();
        this.builder.buildVideo();
        this.builder.buildTeclado();
    }
}
