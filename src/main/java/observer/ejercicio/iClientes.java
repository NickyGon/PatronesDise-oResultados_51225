package observer.ejercicio;

import java.util.List;

public interface iClientes {
    List<ClienteRegistrado.Categorias> getCategoria();
    void update(String message,Notificacion notificacion);
}
