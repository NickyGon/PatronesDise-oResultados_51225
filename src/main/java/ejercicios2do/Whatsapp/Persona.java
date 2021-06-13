package ejercicios2do.Whatsapp;


public class Persona extends Colleague {

    private String estado;
    private int telefono;
    private String nombre;

    public Persona(iAppComunicacion mediador) {
        super(mediador);
    }

    @Override
    public void enviar(String mensaje,String destinatario) {
        appComunicacion.enviar(mensaje,this,destinatario);
    }

    @Override
    public void mensajeRecibido(String mensaje) {
        System.out.println(nombre +"("+telefono+". Estado: "+estado+") recibió el mensaje: "+mensaje);
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
