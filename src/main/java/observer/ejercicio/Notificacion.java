package observer.ejercicio;

public class Notificacion {
    private String categoria;
    private String descripcion;

    public Notificacion(String categoria, String descripcion) {
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void info(){
        System.out.println("INFO>"+ categoria +": "+descripcion);
    }
}
