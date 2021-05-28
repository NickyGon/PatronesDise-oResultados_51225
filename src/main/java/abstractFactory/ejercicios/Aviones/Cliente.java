package abstractFactory.ejercicios.Aviones;

public class Cliente {
    private String nombre;
    private String ci;
    private String fechaNacimiento;

    public Cliente(){

    }

    public Cliente(String nombre, String ci, String fechaNacimiento) {
        this.nombre = nombre;
        this.ci = ci;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void showInfo(){
        System.out.println("Cliente: "+nombre+". CI: "+ci+". Fecha de nacimiento: "+fechaNacimiento);
    }
}
