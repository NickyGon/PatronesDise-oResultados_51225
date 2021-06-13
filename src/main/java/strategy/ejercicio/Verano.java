package strategy.ejercicio;

import java.util.List;

public class Verano implements iEstacion{

    @Override
    public void establecerPrecios(List<Ropa> listaRopa) {
        System.out.println("En este verano, rebajamos el 10% de nuestros precios!!");
        for (Ropa ropa: listaRopa){
            int precioanterior=ropa.getPrecio();
            ropa.setPrecio((int)(ropa.getPrecio()*0.9));
            ropa.info();
            ropa.setPrecio(precioanterior);
        }
    }
}
