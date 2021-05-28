package factoryMethod.ejemplos.heladeria;

public class Base {
    private String nombre;
    private String tamano;
    private String tipo;
    private String costo;

    public Base(){

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
        System.out.println("Nombre base: "+nombre);
        System.out.println("Tamano base: "+tamano);
        System.out.println("Tipo base: "+tipo);
        System.out.println("Costo base: "+costo);
    }
}
