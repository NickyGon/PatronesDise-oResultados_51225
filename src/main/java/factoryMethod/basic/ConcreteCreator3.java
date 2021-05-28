package factoryMethod.basic;

public class ConcreteCreator3 extends Creator {

    @Override
    public ConcreteProduct3 factoryMethod() {
        ConcreteProduct3 product= new ConcreteProduct3();
        //aqui atributos que son otros objetos
        return product;
    }
}
