package factoryMethod.basic;

public class ConcreteProduct3 implements iProduct{
    public ConcreteProduct3(){}
    @Override
    public void create() {
        System.out.println("ProductConcrete3");
    }
}
