package ejercicios.abstractFactory;

public class Lenguaje implements iMateria{
    private int numeroDeExamenes;
    private String modalidad;
    private int numeroDeLibrosALeer;
    private Estudiante[] estudiante;

    public Lenguaje() {
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

    public int getNumeroDeLibrosALeer() {
        return numeroDeLibrosALeer;
    }

    public void setNumeroDeLibrosALeer(int numeroDeLibrosALeer) {
        this.numeroDeLibrosALeer = numeroDeLibrosALeer;
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
        System.out.println("Número de libros a leer: "+numeroDeLibrosALeer);
        System.out.println("Lista de estudiantes: ");
        for (Estudiante e: estudiante){
            if (e!=null)
                e.showInfo();
        }
    }
}
