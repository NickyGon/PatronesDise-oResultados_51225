package visitor.ejercicio.intercambio;

import java.text.DecimalFormat;

public class LibreCambista implements iTurista{

    //V=Dolar a moneda F=Moneda a Dolar
    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public void cambiar(int monedas, iPaises.changeMode changeMode, Brasil brasil) {
        if (changeMode.equals(iPaises.changeMode.DOLARMONEDA)){
            System.out.println("Cambio realizado: "+monedas+" dolares a "+Double.valueOf(df.format(brasil.getCambio()))+" reales brasileños");
        }else if (changeMode.equals(iPaises.changeMode.MONEDADOLAR)){
            System.out.println("Cambio realizado: "+monedas+" reales brasileños a "+brasil.getCambio()+" dolares");
        }
    }

    @Override
    public void cambiar(int monedas, iPaises.changeMode changeMode, Argentina argentina) {
        if (changeMode.equals(iPaises.changeMode.DOLARMONEDA)){
            System.out.println("Cambio realizado: "+monedas+" dolares a "+argentina.getCambio()+" pesos argentinos");
        }else if (changeMode.equals(iPaises.changeMode.MONEDADOLAR)){
            System.out.println("Cambio realizado: "+monedas+" pesos argentinos a "+argentina.getCambio()+" dolares");
        }
    }

    @Override
    public void cambiar(int monedas, iPaises.changeMode changeMode, Bolivia bolivia) {
        if (changeMode.equals(iPaises.changeMode.DOLARMONEDA)){
            System.out.println("Cambio realizado: "+monedas+" dolares a "+bolivia.getCambio()+" bolivianos");
        }else if (changeMode.equals(iPaises.changeMode.MONEDADOLAR)){
            System.out.println("Cambio realizado: "+monedas+" bolivianos a "+bolivia.getCambio()+" dolares");
        }
    }


    @Override
    public void cambiar(int monedas, iPaises.changeMode changeMode, Italia italia) {
        if (changeMode.equals(iPaises.changeMode.DOLARMONEDA)){
            System.out.println("Cambio realizado: "+monedas+" dolares a "+italia.getCambio()+" euros");
        }else if (changeMode.equals(iPaises.changeMode.MONEDADOLAR)){
            System.out.println("Cambio realizado: "+monedas+" euros a "+italia.getCambio()+" dolares");
        }
    }

}
