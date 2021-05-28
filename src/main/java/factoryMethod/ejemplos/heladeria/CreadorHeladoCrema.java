package factoryMethod.ejemplos.heladeria;

public class CreadorHeladoCrema extends CreatorHelados{

    @Override
    public HeladoDeCrema create() {
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

        Crema crema1=new Crema();
        crema1.setCosto("1");
        crema1.setMarca("PIL");
        crema1.setSabor("Chocolate");

        HeladoDeCrema heladoDeCrema= new HeladoDeCrema();
        heladoDeCrema.setBase(b1Cono);
        heladoDeCrema.setForma("Clasica");
        heladoDeCrema.setFruta(fruta);
        heladoDeCrema.setTamano("Grande");
        heladoDeCrema.setCrema(crema1);

        return heladoDeCrema;
    }
}
