package singleton.ejemplos.logger;

public class Director {
    String nombre;
    String gradoAcademico;

    public Director(){
        Logger.getInstance().info("Instanciando un director");
    }

    public String getNombre() {
        Logger.getInstance().info("Obteniendo el nombre del director: "+nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        Logger.getInstance().info("Llenando el nombre del director");
        this.nombre = nombre;
    }

    public String getGradoAcademico() {
        Logger.getInstance().info("Obteniendo el grado académico del director: "+gradoAcademico);
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        Logger.getInstance().info("Llenando el grado académico del director");
        this.gradoAcademico = gradoAcademico;
    }
}
