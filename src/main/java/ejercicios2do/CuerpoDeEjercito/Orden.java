package ejercicios2do.CuerpoDeEjercito;

import java.util.Locale;

public class Orden {
    private String descripcion;
    private String categoria;

    public enum Categoria{
        MANIFESTACION,DESBLOQUEO,LIMPIEZA,ENTREVISTAS,DISCIPLINA;
    }

    public Orden(String porcionDescripcion) {
        this.descripcion = porcionDescripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCategoria(Categoria tipo){
        switch (tipo){
            case DESBLOQUEO:
                categoria="desbloqueo";
                descripcion="Se necesita ayuda en el desbloqueo en "+descripcion;
                break;
            case MANIFESTACION:
                categoria="manifestacion";
                descripcion="Se necesita refuerzos para controlar los disturbios de "+descripcion;
                break;
            case LIMPIEZA:
                categoria="limpieza";
                descripcion="Se requiere servicio de limpieza en "+descripcion;
                break;
            case DISCIPLINA:
                categoria="disciplina";
                descripcion="A las 07:00, se necesita encargado de disciplina para el grupo de cadetes "+descripcion;
                break;
            case ENTREVISTAS:
                categoria="entrevistas";
                descripcion="Se lo requiere para atender una entrevista de información con "+descripcion;
                break;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void showInfo(){
        System.out.println("ORDEN DE CATEGORIA: "+categoria);
        System.out.println(descripcion);
        System.out.println("-----------------");
    }
}
