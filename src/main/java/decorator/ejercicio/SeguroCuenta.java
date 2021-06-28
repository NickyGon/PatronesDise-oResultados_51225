package decorator.ejercicio;



public class SeguroCuenta extends Funcionalidad{

    private int discount=0;

    public SeguroCuenta(Banco banco, int discount) {
        super(banco);
        this.discount=discount;
    }

    @Override
    public void realizarOperacion() {
        super.realizarOperacion();
        int discounted=((100-discount)*super.getMonto())/100;
        super.setMonto(discounted);
        System.out.println("Monto en la cuenta con descuento de "+discount+"% :"+super.getMonto()+" Bs.");
    }
}
