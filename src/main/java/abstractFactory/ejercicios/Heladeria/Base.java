package abstractFactory.ejercicios.Heladeria;

public class Base {
    private String nombre;
    private String tamano;
    private String tipo;
    private String costo;

    public Base(){

    }

    public Base(String nombre, String tamano, String tipo, String costo) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public void showInfo(){
        System.out.println("Base: "+nombre+" "+tipo+" tamaño "+tamano+". Costo: "+costo);
    }
}
