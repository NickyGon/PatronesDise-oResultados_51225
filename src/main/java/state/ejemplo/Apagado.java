package state.ejemplo;

public class Apagado implements iEstadoComputadora{


    public Apagado() {

    }



    @Override
    public void handler(Computadora computadora){
        System.out.println("Estado: Apagado");
        computadora.setTarjetaVideo(new TarjetaVideo(0,"apagado"));
        computadora.setRAM(new MemoriaRam(0,"NAN"));
        computadora.setTimeLimit(0);
        System.out.println("%Video: "+computadora.getTarjetaVideo().getPercentageUse());
        System.out.println("%Memoria: "+computadora.getRAM().getPercentageUse());
        System.out.println("Tiempo: "+computadora.getTimeLimit());
        System.out.println("*******");
    }
}
