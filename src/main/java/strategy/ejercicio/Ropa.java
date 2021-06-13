package strategy.ejercicio;

public class Ropa {
    private String tipo;
    private int precio;
    private String marca;
    private String talla;

    public Ropa(){}

    public Ropa(String tipo, int precio, String marca,String talla) {
        this.tipo = tipo;
        this.precio = precio;
        this.marca = marca;
        this.talla=talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void info(){
        System.out.println("- "+tipo+" talla "+talla+" de "+marca+ ". Precio: "+precio+"Bs.");
    }
}
