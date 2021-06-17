package ejercicios2do.Extra;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Client {
    public static void main(String[]args){
        Banco banco=new Banco();
        Persona persona= new Persona("Nicole Góngora",11110692,21,"La Paz");
        Calendar myCalendar = new GregorianCalendar(2021, 12, 10);
        Date myDate = myCalendar.getTime();
        Cuenta cuenta= new Cuenta("1346788",persona,1000,myDate);

        banco.pagarPrestamo(50,cuenta);
        banco.pagarPrestamo(100,cuenta);
        banco.pagarPrestamo(150,cuenta);
        banco.pagarPrestamo(200,cuenta);
        banco.pagarPrestamo(300,cuenta);
        banco.pagarPrestamo(200,cuenta);
    }
}
