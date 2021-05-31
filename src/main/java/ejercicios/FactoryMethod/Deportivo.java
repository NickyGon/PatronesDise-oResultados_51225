package ejercicios.FactoryMethod;

public class Deportivo {
    private String Talla;
    private String color;
    private int numeroPrendas;

    public Deportivo(){

    }

    public Deportivo(String talla, String color, int numeroPrendas) {
        Talla = talla;
        this.color = color;
        this.numeroPrendas = numeroPrendas;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String talla) {
        Talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPrendas() {
        return numeroPrendas;
    }

    public void setNumeroPrendas(int numeroPrendas) {
        this.numeroPrendas = numeroPrendas;
    }

    public void showData(){
        System.out.println("Deportivo. Talla: "+Talla+". Color: "+color+". Número de prendas: "+numeroPrendas);
    }

}
