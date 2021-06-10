package observer.ejercicio;

public class Persona {
    private String ci;
    private String name;

    public Persona(String ci, String name) {
        this.ci = ci;
        this.name = name;
    }

    public void info(){
        System.out.println("INFO> CI: "+ci+" Nombre: "+name);
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
