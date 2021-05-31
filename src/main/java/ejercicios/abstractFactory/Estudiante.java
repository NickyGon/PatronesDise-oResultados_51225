
package ejercicios.abstractFactory;

public class Estudiante {
    private String nombre;
    private int Edad;
    private int promedio;
    private int Nota;

    public Estudiante(){}
    public Estudiante(String nombre, int edad, int promedio, int nota) {
        this.nombre = nombre;
        Edad = edad;
        this.promedio = promedio;
        Nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int nota) {
        Nota = nota;
    }

    public void showInfo(){
        System.out.println("Estudiante: "+nombre+". "+Edad+" años. Promedio: "+promedio+". Nota de la materia: "+Nota);
    }

}
