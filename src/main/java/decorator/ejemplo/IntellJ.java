package decorator.ejemplo;

public class IntellJ implements IDE{
    private String tamano;
    private String licencia;
    private String version;
    private int precio;
    private String lengProg;


    public IntellJ() {
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

    public String getLengProg() {
        return lengProg;
    }

    public void setLengProg(String lengProg) {
        this.lengProg = lengProg;
    }

    @Override
    public void execute() {
        System.out.println("IntellJ "+version);
        System.out.println("Tamaño: "+tamano);
        System.out.println("Licencia: "+licencia);
        System.out.println("Precio: "+precio+"$");
        System.out.println("Lenguaje de programacion: "+lengProg);
    }
}
