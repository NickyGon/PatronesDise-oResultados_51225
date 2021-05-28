package abstractFactory.ejercicios.Heladeria;


public class HeladoDeAgua implements iHelado {
    private String tamano;
    private String forma;
    private Fruta fruta;
    private Base base;

    public HeladoDeAgua(){
        fruta = new Fruta();
        base = new Base();
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    @Override
    public void crear() {
        System.out.println("---HELADO DE AGUA---");
        System.out.println("Tamaño: "+tamano);
        System.out.println("Forma: "+forma);
        fruta.showInfo();
        base.showInfo();
    }
}
