package abstractFactory.basic;

public class ConcreteProduct3 implements iProduct{

    @Override
    public void readDato() {
        System.out.println("read Dato ConcreteProduct3");
    }

    @Override
    public void crearDato() {
        System.out.println("create Dato ConcreteProduct3");
    }

    @Override
    public void updateDato() {
        System.out.println("update Dato ConcreteProduct3");
    }

    @Override
    public void deleteDato() {
        System.out.println("delete Dato ConcreteProduct3");
    }
}
