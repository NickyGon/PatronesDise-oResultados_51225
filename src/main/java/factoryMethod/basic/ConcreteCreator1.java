package factoryMethod.basic;

public class ConcreteCreator1 extends Creator {

    @Override
    public ConcreteProduct factoryMethod() {
        ConcreteProduct product= new ConcreteProduct();
        //aqui atributos que son otros objetos
        return product;
    }
}
