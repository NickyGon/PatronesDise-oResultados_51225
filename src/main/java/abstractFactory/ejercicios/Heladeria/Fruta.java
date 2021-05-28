package abstractFactory.ejercicios.Heladeria;

public class Fruta {
    private String tipo;
    private String nombre;
    private String costo;
    private String tamano;

    public Fruta(){
    }

    public Fruta(String tipo, String nombre, String costo, String tamano) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.costo = costo;
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void showInfo() {
        System.out.println("Fruta: "+nombre+" "+tipo+" "+tamano+". Costo: "+costo);
    }
}
