package chainOfResponsibility.ejercicio.servicioSoftware;

public class Solicitud {
    public String tipo;
    public String descripcion;

    public Solicitud(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void showInfo(){
        System.out.println("Tipo: "+tipo);
        System.out.println("Descripcion" +descripcion );
    }
}
