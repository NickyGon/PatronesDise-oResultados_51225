package factoryMethod.ejercicios;

public class Cliente {
    private String nombre;
    private String ci;
    private String fechaNacimiento;

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
