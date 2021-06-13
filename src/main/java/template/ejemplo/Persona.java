package template.ejemplo;

public class Persona {
    private String name;

    public Persona(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void caminar(){
        System.out.println("Caminando...");
    }

    protected void caminar2(){
        System.out.println("Persona> caminando");
    }
}
