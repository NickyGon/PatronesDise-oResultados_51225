package ejercicios.FactoryMethod;

public class Cuadernos {
    private String tipo;
    private int numeroHojas;

    public Cuadernos(){

    }

    public Cuadernos(String tipo, int numeroHojas) {
        this.tipo = tipo;
        this.numeroHojas = numeroHojas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    public void showData(){
        System.out.println("Cuaderno. Tipo: "+tipo+". Número de hojas: "+numeroHojas);
    }

}
