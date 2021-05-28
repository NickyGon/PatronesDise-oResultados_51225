package factoryMethod.basic;

public class ConcreteCreator2 extends Creator {

    @Override
    public ConcreteProduct2 factoryMethod() {
        ConcreteProduct2 product= new ConcreteProduct2();
        //aqui atributos que son otros objetos
        return product;
    }
}
