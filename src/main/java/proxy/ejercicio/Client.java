package proxy.ejercicio;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Client {
    public static void main(String[]args) {

        Persona persona= new Persona("Lopez Samuel","11113342","Oruro");
        Cuenta cuenta= new Cuenta("1234 5678 1234 5678",1000,persona);
        Calendar myCalendar = new GregorianCalendar(2023, Calendar.APRIL, 11);
        TarjetaCredito tarjetaCredito= new TarjetaCredito("U8273",myCalendar.getTime(),cuenta);

        tarjetaCredito.comprar(20,new Euro());
        tarjetaCredito.comprar(30,new Dolar());
        tarjetaCredito.comprar(40,new Boliviano());
        tarjetaCredito.comprar(100,new PesoArg());
        tarjetaCredito.comprar(90,new Dolar());
        tarjetaCredito.comprar(60,new Dolar());
        tarjetaCredito.comprar(50,new Boliviano());//aqui para el servicio, ya que no hay monto de que sacar
        tarjetaCredito.comprar(50,new Boliviano());
    }
}
