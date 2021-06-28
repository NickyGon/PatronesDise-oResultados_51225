package decorator.ejercicio;

import java.util.Random;

public class Promocion extends Funcionalidad{

    private int numeroSorteo=0;
    public Promocion(Banco banco) {
        super(banco);
    }


    @Override
    public void realizarOperacion() {
        Random rand= new Random();
        super.realizarOperacion();
        System.out.println("Entra al sorteo DuplicayGana! ");
        numeroSorteo=Math.abs(rand.nextInt());
        System.out.println("Su numero de sorteo: "+numeroSorteo);
        if (numeroSorteo%2==0){
            super.setMonto(super.getMonto()*2);
            System.out.println("Felicidades! Su monto en cuenta se duplicó con su número de entrada!");
            System.out.println("Monto total: "+super.getMonto());
        } else{
            System.out.println("Siga participando, que ya se acerca!");
        }
    }
}
