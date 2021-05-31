package ejercicios.abstractFactory;

public class Historia implements iMateria{
    private int numeroDeExamenes;
    private String modalidad;
    private String enfoque;
    private Estudiante[] estudiante;

    public Historia() {
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

    public String getEnfoque() {
        return enfoque;
    }

    public void setEnfoque(String enfoque) {
        this.enfoque = enfoque;
    }

    public Estudiante[] getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante[] estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public void inscribir() {
        System.out.println("---Sociales---");
        System.out.println("Numero de exámenes: "+numeroDeExamenes);
        System.out.println("Modalidad: "+modalidad);
        System.out.println("Enfoque de las lecciones: "+enfoque);
        System.out.println("Lista de estudiantes: ");
        for (Estudiante e: estudiante){
            if (e!=null)
                e.showInfo();
        }
    }
}
