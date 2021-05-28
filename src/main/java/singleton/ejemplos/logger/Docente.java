package singleton.ejemplos.logger;

public class Docente {
    String nombre;
    String categoría;
    String materia;

    public Docente(){
        Logger.getInstance().info("Instanciando un docente");
    }

    public String getNombre() {
        Logger.getInstance().info("Obteniendo el nombre del docente: "+nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        Logger.getInstance().info("Llenando el nombre del docente");
        this.nombre = nombre;
    }

    public String getCategoría() {
        Logger.getInstance().info("Obtendiendo la categoría del docente: "+categoría);
        return categoría;
    }

    public void setCategoría(String categoría) {
        Logger.getInstance().info("Llenando la categoría del docente");
        this.categoría = categoría;
    }

    public String getMateria() {
        Logger.getInstance().info("Obtendiendo la materia del docente: "+materia);
        return materia;
    }

    public void setMateria(String materia) {
        Logger.getInstance().info("Llenando la materia del docente");
        this.materia = materia;
    }
}
