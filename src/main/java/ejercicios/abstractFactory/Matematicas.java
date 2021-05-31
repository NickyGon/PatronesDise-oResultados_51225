package ejercicios.abstractFactory;

public class Matematicas implements iMateria{
    private int numeroDeExamenes;
    private String modalidad;
    private String nivelMatematicas;
    private Estudiante[] estudiante;

    public Matematicas() {
        this.estudiante = estudiante;
    }

    public int getNumeroDeExamenes() {
        return numeroDeExamenes;
    }

    public void setNumeroDeExamenes(int numeroDeExamenes) {
        this.numeroDeExamenes = numeroDeExamenes;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getNivelMatematicas() {
        return nivelMatematicas;
    }

    public void setNivelMatematicas(String nivelMatematicas) {
        this.nivelMatematicas = nivelMatematicas;
    }

    public Estudiante[] getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante[] estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public void inscribir() {
        System.out.println("---Matemáticas---");
        System.out.println("Numero de exámenes: "+numeroDeExamenes);
        System.out.println("Modalidad: "+modalidad);
        System.out.println("Nivel de enseñanza: "+nivelMatematicas);
        System.out.println("Lista de estudiantes: ");
        for (Estudiante e: estudiante){
            if (e!=null)
                e.showInfo();
        }
    }
}
