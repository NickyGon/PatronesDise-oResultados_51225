package ejercicios.abstractFactory;

public class Inscripcion {
    public enum Materia{
        HISTORIA,INGLES,LENGUAJE,MATEMATICAS;
    }

    public static iMateria inscribir(Materia type){
        iMateria materia;
        switch (type){
            case INGLES:
                materia=new Ingles();
                ((Ingles)materia).setNivelDeIngles("Avanzado");
                ((Ingles)materia).setModalidad("Virtual");
                ((Ingles)materia).setNumeroDeExamenes(4);
                ((Ingles)materia).setEstudiante(new Estudiante[10]);
                break;
            case HISTORIA:
                materia=new Historia();
                ((Historia)materia).setEnfoque("Mundial");
                ((Historia)materia).setModalidad("Semipresencial");
                ((Historia)materia).setNumeroDeExamenes(3);
                ((Historia)materia).setEstudiante(new Estudiante[10]);
                break;
            case LENGUAJE:
                materia=new Lenguaje();
                ((Lenguaje)materia).setNumeroDeLibrosALeer(5);
                ((Lenguaje)materia).setModalidad("Virtual");
                ((Lenguaje)materia).setNumeroDeExamenes(3);
                ((Lenguaje)materia).setEstudiante(new Estudiante[10]);
                break;
            case MATEMATICAS:
                materia=new Matematicas();
                ((Matematicas)materia).setNivelMatematicas("universitario");
                ((Matematicas)materia).setModalidad("Semipresencial");
                ((Matematicas)materia).setNumeroDeExamenes(3);
                ((Matematicas)materia).setEstudiante(new Estudiante[10]);
                break;
            default:
                materia=null;
                break;
        }
        return materia;
    }
}
