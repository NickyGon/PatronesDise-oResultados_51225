package composite.ejercicio;

public abstract class ArtefactosElectronicos {
    private String marca;
    private String modelo;
    private String nombreGrupo;
    private int precio=100;

    public ArtefactosElectronicos(String nombre){
        this.nombreGrupo=nombre;
    }
    public ArtefactosElectronicos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void info(){
        System.out.println("Computadora "+modelo+" "+marca+". Precio: "+precio+"$");
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract void operation();
    public abstract void add(ArtefactosElectronicos component);
    public abstract void remove(ArtefactosElectronicos component);
    public abstract void getChild(int position);
}
