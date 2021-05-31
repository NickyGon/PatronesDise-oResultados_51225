package ejercicios.FactoryMethod;

public class Client {
    public static void main(String[]args){
        CreatorKits c1=new CreatorKitColegial();
        CreatorKits c1a=new CreatorKitColegial();

        KitColegial k1=(KitColegial) c1a.create();
        k1.setLibro(new Libros("Matemáticas","Raul Gonzalez"));
        k1.setComputadora(new Computadoras("Asus","Mac"));
        c1.create().crear();
        k1.crear();

        CreatorKits c2=new CreatorKitEscolar();
        CreatorKits c2a=new CreatorKitEscolar();

        KitEscolar k2=(KitEscolar) c2a.create();
        k2.setCuaderno(new Cuadernos("Empastado",300));
        k2.setDeportivo(new Deportivo("S",k2.getDeportivo().getColor(),k2.getDeportivo().getNumeroPrendas()));
        c2.create().crear();
        k2.crear();

    }


}
