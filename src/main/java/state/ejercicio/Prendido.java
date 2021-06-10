package state.ejercicio;

import java.util.Random;

public class Prendido implements iEstadoComputadora{
    private int enabledPrograms=0;
    @Override
    public void handler(Computadora computadora) {
        System.out.println("ENCENDIENDO");

        enabledPrograms=new Random().nextInt(computadora.getProgramas().length);

        computadora.setConsumoEnCPU(computadora.getConsumoEnCPU()+(5*enabledPrograms));
        computadora.setConsumoEnRAM(computadora.getConsumoEnRAM()+(5*enabledPrograms));
        System.out.println("Programas abiertos: "+enabledPrograms);
        for (int i=0;i<enabledPrograms;i++) {
                System.out.println("- "+computadora.getProgramas()[i]);
        }
        System.out.println("Consumo en RAM: "+computadora.getConsumoEnRAM()+"%");
        System.out.println("Consumo en CPU: "+computadora.getConsumoEnCPU()+"%");
        System.out.println("********************");

    }
}
