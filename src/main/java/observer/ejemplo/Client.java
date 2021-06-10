package observer.ejemplo;



public class Client {
    public static void main(String[]args){
        CanalDeYoutube upb=new CanalDeYoutube();
        UsuarioREgistrado usuario1=new UsuarioREgistrado(new Persona("11119028","Nicole"),"Educacion");
        UsuarioREgistrado usuario2=new UsuarioREgistrado(new Persona("11119029","Nicole1"),"Educacion");
        UsuarioREgistrado usuario3=new UsuarioREgistrado(new Persona("11119030","Nicole2"),"Comedia");
        UsuarioREgistrado usuario4=new UsuarioREgistrado(new Persona("11119031","Nicole3"),"Topicos");
        upb.attach(usuario1);
        upb.attach(usuario2);
        upb.attach(usuario3);
        upb.attach(usuario4);

        upb.uploadVideo(new Video("Angulos en geometria","Educacion"));

    }
}
