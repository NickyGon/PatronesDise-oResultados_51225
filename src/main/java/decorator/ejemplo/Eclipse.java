package decorator.ejemplo;

public class Eclipse implements IDE{
    private String tamano;
    private String licencia;
    private String version;
    private int precio;


    public Eclipse() {
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void execute() {
        System.out.println("Eclipse "+version);
        System.out.println("Tamaño: "+tamano);
        System.out.println("Licencia: "+licencia);
        System.out.println("Precio: "+precio+"$");
    }
}
