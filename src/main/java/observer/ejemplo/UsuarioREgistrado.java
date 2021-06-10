package observer.ejemplo;

public class UsuarioREgistrado implements iUsuario{
    private Persona persona;
    private String categoria;

    public UsuarioREgistrado(Persona persona,String categoria){
        this.persona=persona;
        this.categoria=categoria;
    }

    @Override
    public String getCategoria() {
        return this.categoria;
    }

    @Override
    public void update(String message, Video video) {
        System.out.println("********* NOTIFY *********");
        System.out.println(message);
        persona.info();
        video.info();
    }
}
