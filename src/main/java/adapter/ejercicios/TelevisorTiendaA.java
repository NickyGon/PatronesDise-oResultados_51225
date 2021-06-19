package adapter.ejercicios;


public class TelevisorTiendaA implements iArtefactosA{

    private Televisor televisor;

    public TelevisorTiendaA(Televisor televisor) {
        System.out.println("***Adaptando el aparato "+ televisor.getClass().getSimpleName()+"***");
        this.televisor = televisor;
    }


    @Override
    public void showPrecio(boolean Comprar) {
        set();
        System.out.println("***Adaptando la presentación de precio del aparato "+ televisor.getClass().getSimpleName()+"***");
        this.televisor.showCosto(Comprar);
        restore();
    }

    @Override
    public void showTiempoDeVida() {
        set();
        System.out.println("***Adaptando la presentación de tiempo de vida del aparato "+ televisor.getClass().getSimpleName()+"***");
        this.televisor.showTiempoDeGarantia();
        restore();
    }

    @Override
    public void info() {
        set();
        System.out.println("***Adaptando la presentación del aparato "+ televisor.getClass().getSimpleName()+"***");
        this.televisor.info();
        restore();
    }

    @Override
    public void prender() {
        set();
        System.out.println("***Adaptando la exposicion del aparato "+ televisor.getClass().getSimpleName()+"***");
        this.televisor.mostrar();
        restore();
    }

    @Override
    public void comprar() {
        set();
        System.out.println("***Adaptando la compra del aparato "+ televisor.getClass().getSimpleName()+"***");
        this.televisor.comprar();
        restore();
    }

    public void set(){
        this.televisor.setTipoTiempo("vida");
        this.televisor.setUnitTiempo("horas");
        this.televisor.setTiempoDeGarantia(this.televisor.getTiempoDeGarantia()*365*24);
    }
    public void restore(){
        this.televisor.setTipoTiempo("garantía");
        this.televisor.setUnitTiempo("años");
        double dayHour= 1.0/(365.0*24.0);
        double total=Math.round(dayHour*(double)this.televisor.getTiempoDeGarantia());
        this.televisor.setTiempoDeGarantia((int)total);
    }
}
