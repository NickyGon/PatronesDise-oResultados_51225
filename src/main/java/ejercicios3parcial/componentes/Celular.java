package ejercicios3parcial.componentes;

public class Celular implements iObjetos{
    private String modelo;
    private String marca;
    private String androidVersion;
    private int numeroCamara;

    public Celular( ){
    }

    public Celular(String modelo, String marca, String androidVersion, int numeroCamara) {
        this.modelo = modelo;
        this.marca = marca;
        this.androidVersion = androidVersion;
        this.numeroCamara = numeroCamara;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public int getNumeroCamara() {
        return numeroCamara;
    }

    public void setNumeroCamara(int numeroCamara) {
        this.numeroCamara = numeroCamara;
    }

    public void info(){
        System.out.println("- Celular "+marca+" "+modelo+" con versión Android "+androidVersion+ "Numero de cámaras: "+numeroCamara);
    }

    @Override
    public void analizar(iMetodos metodo) {
        metodo.recomendarMantenimiento(this);
    }
}
