package observer.basic;

public interface iSubject {
    void attach(iObserver observer);
    void detach(iObserver observer);
    void notifyObserver();
}
