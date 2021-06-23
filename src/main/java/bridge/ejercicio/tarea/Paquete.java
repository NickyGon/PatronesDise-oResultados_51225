package bridge.ejercicio.tarea;

public class Paquete {
    private int precio;
    private String nombre;
    private String destinatario;

    public Paquete(int precio, String nombre, String destinatario) {
        this.precio = precio;
        this.nombre = nombre;
        this.destinatario = destinatario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void info(){
        System.out.println("Paquete "+nombre);
        System.out.println("Destinado a: "+destinatario);
        System.out.println("Precio de envío: "+precio+"Bs.");
    }
}
