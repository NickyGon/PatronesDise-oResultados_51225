package bridge.ejercicio.tarea;

public class Mar implements iEnvioPaquete{
    @Override
    public void controlarPrecio(Paquete paquete) {
        System.out.println("Se realiza envío marítimo en un barco contratado. Aumetando precio en 25%");
        paquete.setPrecio((int) (paquete.getPrecio()+(paquete.getPrecio()*0.25)));
    }
}
