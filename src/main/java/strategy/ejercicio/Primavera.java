package strategy.ejercicio;

import java.util.List;

public class Primavera implements iEstacion{

    @Override
    public void establecerPrecios(List<Ropa> listaRopa) {
        System.out.println("Esta primavera, disfruta de la variedad de ropas que tiene nuestra tienda!");
        for (Ropa ropa: listaRopa){
            ropa.info();
        }
    }
}
