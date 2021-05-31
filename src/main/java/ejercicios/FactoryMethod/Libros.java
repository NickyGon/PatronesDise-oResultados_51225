package ejercicios.FactoryMethod;

public class Libros {
    private String tipo;
    private String Autor;

    public Libros(){

    }

    public Libros(String tipo, String autor) {
        this.tipo = tipo;
        Autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void showData(){
        System.out.println("Libro. Tipo: "+tipo+". Autor: "+Autor);
    }

}
