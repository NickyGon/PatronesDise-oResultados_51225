package bridge.ejercicio.tarea;

public class Tierra implements iEnvioPaquete{
    @Override
    public void controlarPrecio(Paquete paquete) {
        System.out.println("Se realiza envío terrestre en un vehículo privado por carretera principal. Aumetando precio en 5%");
        paquete.setPrecio((int) (paquete.getPrecio()+(paquete.getPrecio()*0.05)));
    }
}
