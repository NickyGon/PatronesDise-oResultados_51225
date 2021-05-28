package factoryMethod.ejemplos.heladeria;

public class CreadorHeladoMixto extends CreatorHelados{

    @Override
    public HeladoMixto create() {
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

        HeladoMixto heladoMixto= new HeladoMixto();
        heladoMixto.setBase(b1Cono);
        heladoMixto.setForma("Clasica");
        heladoMixto.setFruta(fruta);
        heladoMixto.setTamano("Grande");
        heladoMixto.setCrema(crema1);
        heladoMixto.setCosto("70");

        return heladoMixto;
    }
}
