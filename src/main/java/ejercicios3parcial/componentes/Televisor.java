package ejercicios3parcial.componentes;

public class Televisor implements iObjetos{
    private String modelo;
    private String marca;
    private String tecnologíaPantalla;
    private int numeroPulgadas;

    public Televisor( ){
    }

    public Televisor(String modelo, String marca, String tecnologíaPantalla, int numeroPulgadas) {
        this.modelo = modelo;
        this.marca = marca;
        this.tecnologíaPantalla = tecnologíaPantalla;
        this.numeroPulgadas = numeroPulgadas;
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

    public String getTecnologíaPantalla() {
        return tecnologíaPantalla;
    }

    public void setTecnologíaPantalla(String tecnologíaPantalla) {
        this.tecnologíaPantalla = tecnologíaPantalla;
    }

    public int getNumeroPulgadas() {
        return numeroPulgadas;
    }

    public void setNumeroPulgadas(int numeroPulgadas) {
        this.numeroPulgadas = numeroPulgadas;
    }

    public void info(){
        System.out.println("- Televisor "+marca+" "+modelo+" con tecnología "+ tecnologíaPantalla + " Resolución: "+ numeroPulgadas +"''");
    }

    @Override
    public void analizar(iMetodos metodo) {
        metodo.recomendarMantenimiento(this);
    }
}
