package visitor.ejercicio.intercambio;

import java.text.DecimalFormat;

public class Bolivia implements iPaises{
    private double cambio;
    
    public double getCambio() {
        return cambio;
    }

    DecimalFormat df = new DecimalFormat("#.##");

    public void setCambio(int monedas,changeMode changeMode) { //V Dolar a Peso, F Peso a Dolar
        if (changeMode.equals(iPaises.changeMode.DOLARMONEDA)){
            this.cambio=monedas*6.92;
        } else if (changeMode.equals(iPaises.changeMode.MONEDADOLAR)){
            this.cambio =monedas*0.14;
        }
        this.cambio=Double.valueOf(df.format(cambio));
    }

    @Override
    public void accept(int monedas,iTurista turista,changeMode changeMode) {
        setCambio(monedas,changeMode);
        turista.cambiar(monedas, changeMode,this);
    }
}
