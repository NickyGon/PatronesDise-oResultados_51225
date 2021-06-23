package proxy.ejercicio;

public class Persona {
    private String nombre;
    private String ci;
    private String ciudad;

    public Persona(String nombre, String ci, String ciudad) {
        this.nombre = nombre;
        this.ci = ci;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void info(){
        System.out.println(nombre+"("+ci+"). "+ciudad);
    }
}
