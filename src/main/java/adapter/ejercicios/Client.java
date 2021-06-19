package adapter.ejercicios;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[]args) {
        Celular celular= new Celular(35040,1300,"Redmi Note 8 Pro","Xiaomi");
        Tablet tablet= new Tablet(87600,2100,"Galaxy Tab S7","Samsung");
        Computadora computadora= new Computadora(26280,6000,"250 G7","HP");

        Lavadora lavadora= new Lavadora(1,7779,"Black Edition","Samsung","637x1075x701 mm");
        Refrigerador refrigerador= new Refrigerador(2,8462,"DB-84X","Electrolux","190.5x83.5x75 cm");
        Televisor televisor= new Televisor(8,6873,"SIGNATURE 8K OLED","LG","1717x984x32.2 mm");
        Map<Integer,String> funcionalidad1= new HashMap<Integer,String>(){{
            put(1,"Lavado Eco de tambor");
            put(2,"Activ Dualwash");
            put(3,"Tecnología Wobble");
        }};

        Map<Integer,String> funcionalidad2= new HashMap<Integer,String>(){{
            put(1,"Doble cajonera para frutas y vegetales");
            put(2,"Panel Blue Touch multifunción");
            put(3,"Tecnología No Frost");
        }};

        Map<Integer,String> funcionalidad3= new HashMap<Integer,String>(){{
            put(1,"Tecnología Oled");
            put(2,"Gallery Design");
            put(3,"Acceso a plataformas de streaming");
            put(4,"Sonido AI Pro");
        }};


        lavadora.setFuncionalidad(funcionalidad1);
        refrigerador.setFuncionalidad(funcionalidad2);
        televisor.setFuncionalidad(funcionalidad3);


        System.out.println("*************************************");
        tablet.showTiempoDeVida();
        tablet.showPrecio(false);
        tablet.info();
        tablet.prender();
        tablet.comprar();

        System.out.println("*************************************");
        celular.showTiempoDeVida();
        celular.showPrecio(false);
        celular.info();
        celular.prender();
        celular.comprar();

        System.out.println("*************************************");
        computadora.showTiempoDeVida();
        computadora.showPrecio(false);
        computadora.info();
        computadora.prender();
        computadora.comprar();

        System.out.println("*************************************");
        lavadora.showTiempoDeGarantia();
        lavadora.showCosto(false);
        lavadora.info();
        lavadora.mostrar();
        lavadora.comprar();

        System.out.println("*************************************");
        refrigerador.showTiempoDeGarantia();
        refrigerador.showCosto(false);
        refrigerador.info();
        refrigerador.mostrar();
        refrigerador.comprar();

        System.out.println("*************************************");
        televisor.showTiempoDeGarantia();
        televisor.showCosto(false);
        televisor.info();
        televisor.mostrar();
        televisor.comprar();

        System.out.println("*************************************");
        LavadoraTiendaA lavadoraTiendaA= new LavadoraTiendaA(lavadora);
        lavadoraTiendaA.info();
        lavadoraTiendaA.showPrecio(false);
        lavadoraTiendaA.prender();
        lavadoraTiendaA.comprar();

        System.out.println("*************************************");
        RefrigeradorTiendaA refrigeradorTiendaA= new RefrigeradorTiendaA(refrigerador);
        refrigeradorTiendaA.info();
        refrigeradorTiendaA.showPrecio(false);
        refrigeradorTiendaA.prender();
        refrigeradorTiendaA.comprar();

        System.out.println("*************************************");
        TelevisorTiendaA televisorTiendaA= new TelevisorTiendaA(televisor);
        televisorTiendaA.info();
        televisorTiendaA.showPrecio(false);
        televisorTiendaA.prender();
        televisorTiendaA.comprar();

        System.out.println("*************************************");
        televisor.showCosto(true);

        //showPrecio(boolean comprar)-->True=Compra el producto/False=Revisa el producto

    }
}
