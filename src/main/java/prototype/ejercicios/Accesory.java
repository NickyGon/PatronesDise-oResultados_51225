package prototype.ejercicios;

public class Accesory {
    private String tipo;
    private String modelo;

    public Accesory(){

    }

    public Accesory(String tipo, String modelo) {
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
