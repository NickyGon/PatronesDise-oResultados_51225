package strategy.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[]args){
        Tienda tienda=new Tienda();
        tienda.setNombre("Manaco");
        List<Ropa> ropas=new ArrayList<>();
        ropas.add(new Ropa("Camisa",90,"Marco Polo","M"));
        ropas.add(new Ropa("Chaqueta",63,"Holanda","S"));
        ropas.add(new Ropa("Chamarra",70,"Koral","L"));
        ropas.add(new Ropa("Polera",82,"Marco Polo","M"));
        ropas.add(new Ropa("Polera",49,"Holanda","S"));
        ropas.add(new Ropa("Canguro",74,"Koral","L"));
        ropas.add(new Ropa("Camiseta",85,"Marco Polo","M"));

        tienda.setListaProductos(ropas);

        tienda.setEstacion(new Primavera());
        tienda.establecerEstrategia();
        tienda.setEstacion(new Verano());
        tienda.establecerEstrategia();
        tienda.setEstacion(new Otono());
        tienda.establecerEstrategia();
        tienda.setEstacion(new Invierno());
        tienda.establecerEstrategia();
    }
}
