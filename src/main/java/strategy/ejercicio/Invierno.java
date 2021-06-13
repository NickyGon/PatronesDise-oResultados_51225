package strategy.ejercicio;

import java.util.List;

public class Invierno implements iEstacion{

    @Override
    public void establecerPrecios(List<Ropa> listaRopa) {
        System.out.println("En este invierno, subimos un 10% los precios mientras traemos mas productos");
        for (Ropa ropa: listaRopa){
            int precioanterior=ropa.getPrecio();
            ropa.setPrecio((int)(ropa.getPrecio()*1.1));
            ropa.info();
            ropa.setPrecio(precioanterior);
        }
    }
}
