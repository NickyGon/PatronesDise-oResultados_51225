package ejercicios.FactoryMethod;

public class CreatorKitColegial extends CreatorKits{

    @Override
    public KitColegial create() {
        KitColegial kitColegial=new KitColegial();
        kitColegial.setMochila(new Mochila(5,"Grande"));
        kitColegial.setComputadora(new Computadoras("Lenovo","Windows"));
        kitColegial.setLibro(new Libros("Lenguaje","Mario Castellón"));
        return kitColegial;
    }
}
