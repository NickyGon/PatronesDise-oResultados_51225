package strategy.ejemplo;

public class Jugador {
    private String ci;
    private String nombre;
    private int numeroCamiseta;
    private String position;

    public Jugador(){}

    public Jugador(String ci, String nombre, int numeroCamiseta, String position) {
        this.ci = ci;
        this.nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
        this.position = position;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void info(){
        System.out.println("INFO> CI: "+ci);
        System.out.println("INFO> Nombre: "+nombre);
        System.out.println("INFO> # Camiseta: "+numeroCamiseta);
    }
}
