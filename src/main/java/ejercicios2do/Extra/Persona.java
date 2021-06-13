package ejercicios2do.Extra;

public class Persona {
    private String nombre;
    private int ci;
    private int edad;
    private String ciudad;

    public Persona(String nombre, int ci, int edad, String ciudad) {
        this.nombre = nombre;
        this.ci = ci;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void showInfo(){
        System.out.println(nombre+"("+ci+")");
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Edad: "+edad);
    }
}
