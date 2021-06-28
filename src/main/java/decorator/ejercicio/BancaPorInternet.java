package decorator.ejercicio;

public class BancaPorInternet extends Funcionalidad{

    private boolean enabled;

    public BancaPorInternet(Banco banco,boolean enabled) {
        super(banco);
        this.enabled=enabled;
    }


    @Override
    public void realizarOperacion() {
        super.realizarOperacion();
        System.out.println("Banca por internet habilitada: "+enabled);
    }
}
