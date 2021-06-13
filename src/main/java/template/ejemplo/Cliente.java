package template.ejemplo;

public class Cliente {
    public static void main(String[]args){
        Docente docente=new Docente();
        Director director=new Director();
        Estudiante estudiante=new Estudiante();
        Marketing marketing=new Marketing();

        docente.caminar();
        docente.materias();
        director.caminar();
        director.adminSemestre();
        estudiante.caminar();
        estudiante.marcandoMaterias();
        marketing.caminar();
        marketing.realizaPromocion();
    }
}
