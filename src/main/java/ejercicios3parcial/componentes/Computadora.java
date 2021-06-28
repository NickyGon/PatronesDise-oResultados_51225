package ejercicios3parcial.componentes;

public class Computadora implements iObjetos{
    private String modelo;
    private String marca;
    private String sistemaOperativo;
    private int memoriaRAM;

    public Computadora( ){
    }

    public Computadora(String modelo, String marca, String sistemaOperativo, int memoriaRAM) {
        this.modelo = modelo;
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.memoriaRAM = memoriaRAM;
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

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void info(){
        System.out.println("- Computadora "+marca+" "+modelo+" con S.O. "+ sistemaOperativo + "Memoria RAM: "+ memoriaRAM+"GB");
    }

    @Override
    public void analizar(iMetodos metodo) {
        metodo.recomendarMantenimiento(this);
    }
}
