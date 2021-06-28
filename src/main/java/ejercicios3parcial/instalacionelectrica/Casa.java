package ejercicios3parcial.instalacionelectrica;

public class Casa {
    private String direccion;
    private int numeroPisos;
    private boolean conPiscina;
    private int numero;

    public Casa(String direccion, int numeroPisos, boolean conPiscina, int numero) {
        this.direccion = direccion;
        this.numeroPisos = numeroPisos;
        this.conPiscina = conPiscina;
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }

    public void setConPiscina(boolean conPiscina) {
        this.conPiscina = conPiscina;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void info(){
        System.out.println("Casa #"+numero+". De "+numeroPisos+" pisos");
        System.out.println("Dirección: "+ direccion);
        System.out.println("Con piscina: "+conPiscina);
    }
}
