package singleton.ejemplos.logger;

public class Estudiante {
    String nombre;
    String semestre;
    String carrera;

    public Estudiante(){
        Logger.getInstance().info("Instanciando al estudiante");
    }

    public void setNombre(String nombre) {
        Logger.getInstance().info("Llenando el nombre del estudiante");
        this.nombre = nombre;
    }

    public void setSemestre(String semestre) {
        Logger.getInstance().info("Llenando el semestre del estudiante");
        this.semestre = semestre;
    }

    public void setCarrera(String carrera) {
        Logger.getInstance().info("Llenando la materia del estudiante");
        this.carrera = carrera;
    }

    public String getNombre() {
        Logger.getInstance().info("Obteniendo el nombre del estudiante: "+nombre);
        return nombre;
    }

    public String getSemestre() {
        Logger.getInstance().info("Obteniendo el semestre del estudiante: "+semestre);
        return semestre;
    }

    public String getCarrera() {
        Logger.getInstance().info("Obteniendo la carrera del estudiante: "+carrera);
        return carrera;
    }
}
