package observer.ejercicio;

import java.util.List;

public class ClienteRegistrado implements iClientes{
    private Persona persona;


    public enum Categorias{
        PROMOCIONES,PRECIO,PREMIO,NOTICIA;
    }

    private List<Categorias> categoria;

    public ClienteRegistrado(Persona persona, List<Categorias> categoria) {
        this.persona = persona;
        this.categoria = categoria;
    }

    @Override
    public List<Categorias> getCategoria() {
        return this.categoria;
    }

    @Override
    public void update(String message, Notificacion notificacion) {
        System.out.println("NOTIFICACION");
        System.out.println(message);
        persona.info();
    }

}
