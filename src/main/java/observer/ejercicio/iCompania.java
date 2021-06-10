package observer.ejercicio;


public interface iCompania {
    void attach(iClientes observer);
    void detach(iClientes observer);
    void notifyObserver(Notificacion notificacion);
}
