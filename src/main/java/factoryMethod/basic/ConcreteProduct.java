package factoryMethod.basic;

public class ConcreteProduct implements iProduct{

    //muchos atributos que son otros objetos y tambien tienen que instanciarse
    public ConcreteProduct(){}

    @Override
    public void create() {
        System.out.println("ProductConcrete1");
    }


}
