package abstractFactory.basic;

public class Cliente {
    public static void main(String[]args){
        FactoryProduct.make("product2").crearDato();
        FactoryProduct.make("product2").readDato();
        ConcreteProduct product1=(ConcreteProduct) FactoryProduct.make("product1");
        product1.crearDato();
        product1.updateDato();

        FactoryProduct.make("product3").crearDato();
    }


}
