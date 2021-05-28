package factoryMethod.basic;

public class ConcreteProduct2 implements iProduct{
    public ConcreteProduct2(){}
    @Override
    public void create() {
        System.out.println("ProductConcrete2");
    }
}
