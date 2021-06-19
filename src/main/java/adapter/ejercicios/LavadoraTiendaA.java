package adapter.ejercicios;

import java.util.HashMap;
import java.util.Map;

public class LavadoraTiendaA implements iArtefactosA{

    private Lavadora lavadora;

    public LavadoraTiendaA(Lavadora lavadora) {
        System.out.println("***Adaptando el aparato "+lavadora.getClass().getSimpleName()+"***");
        this.lavadora=lavadora;
    }


    @Override
    public void showPrecio(boolean Comprar) {
        set();
        System.out.println("***Adaptando la presentación de precio del aparato "+lavadora.getClass().getSimpleName()+"***");
        this.lavadora.showCosto(Comprar);
        restore();
    }

    @Override
    public void showTiempoDeVida() {
        set();
        System.out.println("***Adaptando la presentación de tiempo de vida del aparato "+lavadora.getClass().getSimpleName()+"***");
        this.lavadora.showTiempoDeGarantia();
        restore();
    }

    @Override
    public void info() {
        set();
        System.out.println("***Adaptando la presentación del aparato "+lavadora.getClass().getSimpleName()+"***");
        this.lavadora.info();
        restore();
    }

    @Override
    public void prender() {
        set();
        System.out.println("***Adaptando la exposicion del aparato "+lavadora.getClass().getSimpleName()+"***");
        this.lavadora.mostrar();
        restore();
    }

    @Override
    public void comprar() {
        set();
        System.out.println("***Adaptando la compra del aparato "+lavadora.getClass().getSimpleName()+"***");
        this.lavadora.comprar();
        restore();
    }

    public void set(){
        this.lavadora.setTipoTiempo("vida");
        this.lavadora.setUnitTiempo("horas");
        this.lavadora.setTiempoDeGarantia(this.lavadora.getTiempoDeGarantia()*365*24);
    }
    public void restore(){
        this.lavadora.setTipoTiempo("garantía");
        this.lavadora.setUnitTiempo("años");
        double dayHour= 1.0/(365.0*24.0);
        double total=Math.round(dayHour*(double)this.lavadora.getTiempoDeGarantia());
        this.lavadora.setTiempoDeGarantia((int)total);
    }
}
