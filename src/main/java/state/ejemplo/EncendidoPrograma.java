package state.ejemplo;

import java.util.Random;

public class EncendidoPrograma implements iEstadoComputadora{
    private String nameProgram;

    public EncendidoPrograma(String program) {
        this.nameProgram = program;
    }

    public String getNameProgram() {
        return nameProgram;
    }

    public void setNameProgram(String nameProgram) {
        this.nameProgram = nameProgram;
    }

    @Override
    public void handler(Computadora computadora){
        System.out.println("Estado: Encendido y minado");
        System.out.println("INFO> action: "+ nameProgram);
        MemoriaRam memoriaRam=new MemoriaRam(new Random().nextInt(100),nameProgram);
        computadora.setRAM(memoriaRam);
        System.out.println("INFO> memory usage: "+ memoriaRam.getPercentageUse());
        System.out.println("Acción finalizada");
    }
}
