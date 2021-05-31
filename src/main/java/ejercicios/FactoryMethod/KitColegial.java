package ejercicios.FactoryMethod;


public class KitColegial implements iKit{
    private Mochila mochila;
    private Libros libro;
    private Computadoras computadora;

    public KitColegial(){
        this.mochila=mochila;
        this.libro=libro;
        this.computadora=computadora;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libros getLibro() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    public Computadoras getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadoras computadora) {
        this.computadora = computadora;
    }

    @Override
    public void crear() {
        System.out.println("---Kit Colegial---");
        mochila.showData();
        libro.showData();
        computadora.showData();
    }
}
