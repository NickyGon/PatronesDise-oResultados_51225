package adapter.ejercicios;

public class RefrigeradorTiendaA implements iArtefactosA{

    private Refrigerador refrigerador;

    public RefrigeradorTiendaA(Refrigerador refrigerador) {
        System.out.println("***Adaptando el aparato "+refrigerador.getClass().getSimpleName()+"***");
        this.refrigerador=refrigerador;
    }


    @Override
    public void showPrecio(boolean Comprar) {
        set();
        System.out.println("***Adaptando la presentación de precio del aparato "+refrigerador.getClass().getSimpleName()+"***");
        this.refrigerador.showCosto(Comprar);
        restore();
    }

    @Override
    public void showTiempoDeVida() {
        set();
        System.out.println("***Adaptando la presentación de tiempo de vida del aparato "+refrigerador.getClass().getSimpleName()+"***");
        this.refrigerador.showTiempoDeGarantia();
        restore();
    }

    @Override
    public void info() {
        set();
        System.out.println("***Adaptando la presentación del aparato "+refrigerador.getClass().getSimpleName()+"***");
        this.refrigerador.info();
        restore();
    }

    @Override
    public void prender() {
        set();
        System.out.println("***Adaptando la exposicion del aparato "+refrigerador.getClass().getSimpleName()+"***");
        this.refrigerador.mostrar();
        restore();
    }

    @Override
    public void comprar() {
        set();
        System.out.println("***Adaptando la compra del aparato "+refrigerador.getClass().getSimpleName()+"***");
        this.refrigerador.comprar();
        restore();
    }

    public void set(){
        this.refrigerador.setTipoTiempo("vida");
        this.refrigerador.setUnitTiempo("horas");
        this.refrigerador.setTiempoDeGarantia(this.refrigerador.getTiempoDeGarantia()*365*24);
    }
    public void restore(){
        this.refrigerador.setTipoTiempo("garantía");
        this.refrigerador.setUnitTiempo("años");
        double dayHour= 1.0/(365.0*24.0);
        double total=Math.round(dayHour*(double)this.refrigerador.getTiempoDeGarantia());
        this.refrigerador.setTiempoDeGarantia((int)total);
    }
}
