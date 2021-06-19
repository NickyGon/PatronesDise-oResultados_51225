package adapter.ejercicios;

import java.util.HashMap;
import java.util.Map;

public class Refrigerador implements iArtefactosB{

    private int tiempoDeGarantia;
    private int costo;
    private String modelo;
    private String marca;
    private String tamano;
    private String tipoTiempo="garantía";
    private String unitTiempo="años";
    private Map<Integer,String> funcionalidad=new HashMap<>();


    public Refrigerador(int tiempoDeGarantia, int costo, String modelo, String marca, String tamano) {
        this.tiempoDeGarantia = tiempoDeGarantia;
        this.costo = costo;
        this.modelo = modelo;
        this.marca = marca;
        this.tamano = tamano;
    }

    public int getTiempoDeGarantia() {
        return tiempoDeGarantia;
    }

    public void setTiempoDeGarantia(int tiempoDeGarantia) {
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
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

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Map<Integer, String> getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(Map<Integer, String> funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public String getTipoTiempo() {
        return tipoTiempo;
    }

    public void setTipoTiempo(String tipoTiempo) {
        this.tipoTiempo = tipoTiempo;
    }

    public String getUnitTiempo() {
        return unitTiempo;
    }

    public void setUnitTiempo(String unitTiempo) {
        this.unitTiempo = unitTiempo;
    }

    @Override
    public void showCosto(boolean Comprar) {
        info();
        System.out.println("Precio (del/de la)"+this.getClass().getSimpleName()+": "+ costo+"Bs");
        if (Comprar){
            System.out.println("Pase a caja, por favor");
            comprar();
        } else {
            System.out.println("Puede revisar otros productos");
        }
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("---Mostrando "+tipoTiempo+"---");
        System.out.println("El tiempo de "+tipoTiempo+" del producto es de "+tiempoDeGarantia+" "+unitTiempo);
        System.out.println("Cortesía de la tienda Rendimas");
    }

    @Override
    public void info() {
        System.out.println("---Mostrando información del aparato escogido---");
        System.out.println("Descripcion: "+this.getClass().getSimpleName()+" "+modelo+" "+marca);
        System.out.println("Tamaño: "+tamano);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando las características de su "+this.getClass().getSimpleName()+": ");
        for (Map.Entry<Integer,String> mapEntry: funcionalidad.entrySet()){
            System.out.println("- "+mapEntry.getValue());
        }
        System.out.println("Si desea, puede comprarlo en caja");
    }

    @Override
    public void comprar() {
        System.out.println("---Realizando la compra!---");
        info();
        showTiempoDeGarantia();
        System.out.println("El aparato está siendo llevado al camión de Rendimás a su hogar. Lo estaremos esperando para ayudarle en la instalación");
    }
}
