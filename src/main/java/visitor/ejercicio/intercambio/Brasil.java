package visitor.ejercicio.intercambio;

import java.text.DecimalFormat;

public class Brasil implements iPaises{
    private double cambio;

    public double getCambio() {
        return cambio;
    }

    DecimalFormat df = new DecimalFormat("#.##");

    public void setCambio(int monedas,changeMode changeMode) { //V Dolar a Real, F Real a Dolar
        if (changeMode.equals(iPaises.changeMode.DOLARMONEDA)){
            this.cambio=monedas*5.01;
        } else if (changeMode.equals(iPaises.changeMode.MONEDADOLAR)){
            this.cambio =monedas*0.20;
        }
        this.cambio=Double.valueOf(df.format(cambio));

    }

    @Override
    public void accept(int monedas,iTurista turista,changeMode changeMode) {
        setCambio(monedas,changeMode);
        turista.cambiar(monedas, changeMode,this);
    }
}
