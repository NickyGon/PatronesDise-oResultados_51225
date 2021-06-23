package bridge.ejercicio.tarea;

public class Aire implements iEnvioPaquete{
    @Override
    public void controlarPrecio(Paquete paquete) {
        System.out.println("Se realiza envío aereo en un avión privado. Aumetando precio en 10%");
        paquete.setPrecio((int) (paquete.getPrecio()+(paquete.getPrecio()*0.1)));
    }
}
