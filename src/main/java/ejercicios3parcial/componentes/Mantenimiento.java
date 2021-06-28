package ejercicios3parcial.componentes;

import java.util.Random;

public class Mantenimiento implements iMetodos{
    @Override
    public void recomendarMantenimiento(Celular celular) {
        celular.info();
        System.out.println("Se recomienda realizar un mantenimiento preventivo de uno a dos días en este celular");
    }

    @Override
    public void recomendarMantenimiento(Computadora computadora) {
        computadora.info();
        Random r= new Random();
        int decider= Math.abs(r.nextInt());
        if (decider%2==0){
            System.out.println("Se recomienda realizar un mantenimiento preventivo de 3 a 5 días en este televisor");
        } else {
            System.out.println("Es necesario realizar un mantenimiento correctivo en este instante. Apagando el computador!");
        }

    }

    @Override
    public void recomendarMantenimiento(Televisor televisor) {
        televisor.info();
    }
}
