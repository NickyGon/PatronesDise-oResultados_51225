package observer.ejemplo;



public interface iCanal {
    void attach(iUsuario observer);
    void detach(iUsuario observer);
    void notifyObserver(Video video);
}
