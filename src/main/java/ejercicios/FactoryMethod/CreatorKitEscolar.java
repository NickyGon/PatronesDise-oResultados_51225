package ejercicios.FactoryMethod;

public class CreatorKitEscolar extends CreatorKits{

    @Override
    public KitEscolar create() {
        KitEscolar kitEscolar=new KitEscolar();
        kitEscolar.setCuaderno(new Cuadernos("Traper",250));
        kitEscolar.setDeportivo(new Deportivo("M","Negro",3));
        kitEscolar.setMochila(new Mochila(3,"Grande"));
        return kitEscolar;
    }
}
