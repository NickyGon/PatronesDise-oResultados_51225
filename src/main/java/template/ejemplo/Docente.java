package template.ejemplo;

public class Docente extends Persona{
    public Docente(){}

    public void materias(){
        System.out.println("Dictando materias");
    }

    @Override
    public void caminar(){
        System.out.println("DOCENTE> Caminar");
    }
}
