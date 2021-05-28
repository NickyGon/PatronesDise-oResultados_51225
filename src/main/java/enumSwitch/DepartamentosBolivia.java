package enumSwitch;

import java.math.BigDecimal;
import java.text.DecimalFormat;


public enum DepartamentosBolivia {
    //Cada departamento, con su valor de metros sobre el nivel del mar
    POTOSI(4090),
    ORURO(3706),
    LAPAZ(3640),
    TARIJA(1957),
    SANTACRUZ(416),
    PANDO(280),
    SUCRE(2690),
    COCHABAMBA(2570),
    BENI(155);

    private int metrosSobreNivelDeMar;

    DepartamentosBolivia(int metrosSobreNivelDeMar) {
        this.metrosSobreNivelDeMar = metrosSobreNivelDeMar;
    }


    public static String getInfo(DepartamentosBolivia dep){
        //Se realiza la ecuacion de presion atmosferica: 1atm*e^(-(1.18e-4*nivelSobreElMar))
        double presion=Math.exp((-1)*(1.18e-4)*dep.metrosSobreNivelDeMar);
        DecimalFormat df = new DecimalFormat("####0.00");

        //Segun el departamento, se dirá una frase distinta con la presion hallada
        switch (dep){
            case POTOSI: return "Hogar de la Casa de la Moneda, con presion atmosferica de "+df.format(presion)+" atm";
            case ORURO: return "Tierra del folklore, con presion atmosferica de "+df.format(presion)+" atm";
            case LAPAZ: return "Ciudad Maravilla, con presion atmosferica de "+df.format(presion)+" atm";
            case SUCRE: return "Capital del país, con presion atmosferica de "+df.format(presion)+" atm";
            case COCHABAMBA: return "Llajta querida, con presion atmosferica de "+df.format(presion)+" atm";
            case TARIJA: return "Tierra chaqueña, con presion atmosferica de "+df.format(presion)+" atm";
            case SANTACRUZ: return "La ciudad mas grande, con presion atmosferica de "+df.format(presion)+" atm";
            case PANDO: return "Donde esta la Reserva Manuripi, con presion atmosferica de "+df.format(presion)+" atm";
            case BENI: return "Con Rurrenabaque y Riberalta, con presion atmosferica de "+df.format(presion)+" atm";
            default: return null;
        }
    }
}
