package strategy.ejercicio;

import java.util.List;

public class Otono implements iEstacion{

    @Override
    public void establecerPrecios(List<Ropa> listaRopa) {
        System.out.println("En este otoño, rebajamos nuestros precios a la mitad!!");
        for (Ropa ropa: listaRopa){
            int precioanterior=ropa.getPrecio();
            ropa.setPrecio((int)(ropa.getPrecio()*0.5));
            ropa.info();
            ropa.setPrecio(precioanterior);
        }
    }
}
