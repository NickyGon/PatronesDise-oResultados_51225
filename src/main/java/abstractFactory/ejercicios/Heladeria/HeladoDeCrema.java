package abstractFactory.ejercicios.Heladeria;


public class HeladoDeCrema implements iHelado {
    private String tamano;
    private String forma;
    private Fruta fruta;
    private Base base;
    private Crema crema;

    public HeladoDeCrema(){
        fruta = new Fruta();
        base = new Base();
        crema = new Crema();
    }

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
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
        System.out.println("---HELADO DE CREMA---");
        System.out.println("Forma: "+forma);
        System.out.println("Tamaño: "+tamano);
        fruta.showInfo();
        base.showInfo();
        crema.showInfo();
    }
}
