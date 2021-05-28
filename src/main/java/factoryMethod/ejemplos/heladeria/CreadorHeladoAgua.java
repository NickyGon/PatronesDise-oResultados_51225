package factoryMethod.ejemplos.heladeria;

public class CreadorHeladoAgua extends CreatorHelados{

    @Override
    public HeladoDeAgua create() {
        Base b1Cono=new Base();
        b1Cono.setCosto("5");
        b1Cono.setNombre("Cono");
        b1Cono.setTamano("Grande");
        b1Cono.setTipo("Galleta");

        Fruta fruta=new Fruta();
        fruta.setCosto("1");
        fruta.setNombre("Frutilla");
        fruta.setTamano("Mediano");
        fruta.setTipo("Dulce");

        HeladoDeAgua heladoDeAgua= new HeladoDeAgua();
        heladoDeAgua.setBase(b1Cono);
        heladoDeAgua.setForma("Clasica");
        heladoDeAgua.setFruta(fruta);
        heladoDeAgua.setTamano("Grande");
        return heladoDeAgua;
    }
}
