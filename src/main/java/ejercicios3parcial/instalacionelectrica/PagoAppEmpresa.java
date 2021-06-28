package ejercicios3parcial.instalacionelectrica;

import java.text.DecimalFormat;

public class PagoAppEmpresa implements iFormaDePago{
    @Override
    public void realizarPago(iInstalacion instalacion) {
        DecimalFormat formateador = new DecimalFormat("####.##");
        System.out.println("Cobro final: "+formateador.format(instalacion.getSpent()*(0.9))+" Bs. Cambio de "+formateador.format(instalacion.getSpent()*0.1)+" Bs");
    }
}
