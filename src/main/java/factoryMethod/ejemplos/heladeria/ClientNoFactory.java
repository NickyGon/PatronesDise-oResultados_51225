package factoryMethod.ejemplos.heladeria;

public class ClientNoFactory {
    public static void main (String[]args){
        HeladoDeCrema hc=new HeladoDeCrema();
        Base b1Cono=new Base();
        b1Cono.setCosto("5");
        b1Cono.setNombre("Cono");
        b1Cono.setTamano("Grande");
        b1Cono.setTipo("Galleta");
        hc.setBase(b1Cono);
        Crema crema1=new Crema();
        crema1.setCosto("1");
        crema1.setMarca("PIL");
        crema1.setSabor("Chocolate");
        hc.setCrema(crema1);
        hc.setForma("Clasica");
        Fruta fruta=new Fruta();
        fruta.setCosto("1");
        fruta.setNombre("Frutilla");
        fruta.setTamano("Mediano");
        fruta.setTipo("Ducle");
        hc.setFruta(fruta);
        hc.setTamano("Grande");
        hc.crear();

        //Se vuelve costoso crear un objeto con varios atributos, y peor si algunos de estos son clases a instanciar

        //Solo necesitas crear el objeto, no copiar el código
    }
}
