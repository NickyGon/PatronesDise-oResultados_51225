package observer.ejercicio;


import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[]args){
        Empresa empresa= new Empresa();
        List<ClienteRegistrado.Categorias> lista=new ArrayList<>();
        lista.add(ClienteRegistrado.Categorias.NOTICIA);
        lista.add(ClienteRegistrado.Categorias.PREMIO);

        List<ClienteRegistrado.Categorias> lista2=new ArrayList<>();
        lista2.add(ClienteRegistrado.Categorias.NOTICIA);
        lista2.add(ClienteRegistrado.Categorias.PRECIO);
        ClienteRegistrado cliente1=new ClienteRegistrado(new Persona("11119065","Nicole"),lista);
        ClienteRegistrado cliente2=new ClienteRegistrado(new Persona("11119066","Nicole2"),lista2);



        empresa.attach(cliente1);
        empresa.attach(cliente2);

        empresa.uploadNotifications(new Notificacion("Noticia","El usuario debe pagar su deuda"));
        empresa.uploadNotifications(new Notificacion("Precio","El servicio de Wi-Fi cuesta 50Bs"));
        empresa.uploadNotifications(new Notificacion("Premio","Ganaste 500 bs"));

    }
}
