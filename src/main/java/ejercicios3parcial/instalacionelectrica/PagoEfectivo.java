package ejercicios3parcial.instalacionelectrica;

public class PagoEfectivo implements iFormaDePago{
    @Override
    public void realizarPago(iInstalacion instalacion) {
        System.out.println("Cobro final: "+instalacion.getSpent()+" Bs. Sin cambio");
    }
}
