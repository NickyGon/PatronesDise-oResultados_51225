package observer.basic;

public class ConcreteObserver implements iObserver{

    @Override
    public void update(String message) {
        System.out.println("ConcreteObserver1");
        System.out.println("Notificando: "+message);
    }
}
