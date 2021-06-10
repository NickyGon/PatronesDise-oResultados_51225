package observer.ejercicio;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Empresa implements iCompania{

    private List<iClientes> observerList=new ArrayList<>();


    public void uploadNotifications(Notificacion notificacion){
        notifyObserver(notificacion);
    }
    @Override
    public void attach(iClientes observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(iClientes observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(Notificacion notificacion) {
        for (iClientes usuario:observerList){
            for (ClienteRegistrado.Categorias categoria: usuario.getCategoria()){
                if (notificacion.getCategoria().toUpperCase().equals(categoria.name())){
                    usuario.update(notificacion.getCategoria()+": "+notificacion.getDescripcion(),notificacion);
                }
            }
        }
    }
}
