package factoryMethod.basic;

public class Cliente {
    public static void main (String[]args){
        ConcreteProduct concrete1 = new ConcreteCreator1().factoryMethod();
        ConcreteProduct2 concrete2 = new ConcreteCreator2().factoryMethod();
        ConcreteProduct3 concrete3 = new ConcreteCreator3().factoryMethod();

    }
}
