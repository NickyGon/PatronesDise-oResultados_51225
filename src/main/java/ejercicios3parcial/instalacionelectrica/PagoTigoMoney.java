package ejercicios3parcial.instalacionelectrica;

import java.text.DecimalFormat;

public class PagoTigoMoney implements iFormaDePago{
    DecimalFormat formateador = new DecimalFormat("####.##");
    @Override
    public void realizarPago(iInstalacion instalacion) {

        System.out.println("Cobro final: "+formateador.format(instalacion.getSpent()*(0.98))+" Bs. Cambio de "+formateador.format(instalacion.getSpent()*0.02)+" Bs");
    }
}
