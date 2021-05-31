package ejercicios.FactoryMethod;

public class Mochila {
    private int numeroBolsillos;
    private String tamano;

    public Mochila(){

    }

    public Mochila(int numeroBolsillos, String tamano) {
        this.numeroBolsillos = numeroBolsillos;
        this.tamano = tamano;
    }

    public int getNumeroBolsillos() {
        return numeroBolsillos;
    }

    public void setNumeroBolsillos(int numeroBolsillos) {
        this.numeroBolsillos = numeroBolsillos;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void showData(){
        System.out.println("Mochila. Número de Bolsillos: "+numeroBolsillos+". Tamaño: "+tamano);
    }

}
