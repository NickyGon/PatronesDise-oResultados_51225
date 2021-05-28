package abstractFactory.ejemplos.Navegador;

public class Client {
    public static void main(String[]args){
        FactoryNavegador.make(FactoryNavegador.CHROME).openUrl("google.com");
        FactoryNavegador.make(FactoryNavegador.FIREFOX).openUrl("google.com");
        FactoryNavegador.make(FactoryNavegador.EDGE).openUrl("google.com");
        FactoryNavegador.make(FactoryNavegador.SAFARI).openUrl("google.com");



    }

}
