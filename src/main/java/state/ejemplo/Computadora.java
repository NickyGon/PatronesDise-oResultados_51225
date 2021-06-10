package state.ejemplo;

public class Computadora {
    private iEstadoComputadora state;
    private MemoriaRam RAM;
    private TarjetaVideo tarjetaVideo;
    private int timeLimit;


    public iEstadoComputadora getState() {
        return state;
    }

    public void setState(iEstadoComputadora state) {
        this.state = state;
    }

    public void request(){
        this.state.handler(this);
    }

    public MemoriaRam getRAM() {
        return RAM;
    }

    public void setRAM(MemoriaRam RAM) {
        this.RAM = RAM;
    }

    public TarjetaVideo getTarjetaVideo() {
        return tarjetaVideo;
    }

    public void setTarjetaVideo(TarjetaVideo tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }
}
