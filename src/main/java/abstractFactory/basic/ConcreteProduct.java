package abstractFactory.basic;

public class ConcreteProduct implements iProduct{

    @Override
    public void readDato() {
        System.out.println("read Dato ConcreteProduct");
    }

    @Override
    public void crearDato() {
        System.out.println("create Dato ConcreteProduct");
    }

    @Override
    public void updateDato() {
        System.out.println("update Dato ConcreteProduct");
    }

    @Override
    public void deleteDato() {
        System.out.println("delete Dato ConcreteProduct");
    }
}
