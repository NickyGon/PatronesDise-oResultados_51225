package proxy.ejemplo;

public class Archivo {
    private String nombre;
    private String size;
    private String extension;

    public Archivo() {

    }

    public Archivo(String nombre, String size, String extension) {
        this.nombre = nombre;
        this.size = size;
        this.extension = extension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void showInfo(){
        System.out.println(nombre+"."+extension+" Tamaño: "+size);
    }
}
