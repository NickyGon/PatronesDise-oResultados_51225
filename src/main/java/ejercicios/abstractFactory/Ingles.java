package ejercicios.abstractFactory;

public class Ingles implements iMateria{
    private int numeroDeExamenes;
    private String modalidad;
    private String nivelDeIngles;
    private Estudiante[] estudiante;

    public Ingles() {
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

    public String getNivelDeIngles() {
        return nivelDeIngles;
    }

    public void setNivelDeIngles(String nivelDeIngles) {
        this.nivelDeIngles = nivelDeIngles;
    }

    public Estudiante[] getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante[] estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public void inscribir() {
        System.out.println("---Ingles---");
        System.out.println("Numero de exámenes: "+numeroDeExamenes);
        System.out.println("Modalidad: "+modalidad);
        System.out.println("Nivel de ingles: "+nivelDeIngles);
        System.out.println("Lista de estudiantes: ");
        for (Estudiante e: estudiante){
            if (e!=null)
                e.showInfo();
        }
    }
}
