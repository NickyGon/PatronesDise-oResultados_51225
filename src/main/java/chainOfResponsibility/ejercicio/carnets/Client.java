package chainOfResponsibility.ejercicio.carnets;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Client {
    public static void main(String[]args){
        SEGIP segip=new SEGIP();
        Calendar calendario=new GregorianCalendar(2000,Calendar.APRIL,29);
        Date date=calendario.getTime();
        segip.realizarCarnetizacion(new PersonaRequisitos("Nicole Patricia Góngora Rodríguez",21,"La Paz",date,true,150,1));
        calendario.set(1990,5,30);
        date=calendario.getTime();
        segip.realizarCarnetizacion(new PersonaRequisitos("Romero Gonzáles Lázaro Murillo",31,"Santa Cruz",date,false,100,2));
        calendario.set(2003,6,1);
        date=calendario.getTime();
        segip.realizarCarnetizacion(new PersonaRequisitos("Francisco Guerra Polo Linares",18,"Tarija",date,true,0,3));
        calendario.set(2001,3,23);
        date=calendario.getTime();
        segip.realizarCarnetizacion(new PersonaRequisitos("Pablo Barreras López Eric",20,"Sucre",date,false,0,4));
        calendario.set(1996,4,10);
        date=calendario.getTime();
        segip.realizarCarnetizacion(new PersonaRequisitos("Selena Rosales Morales Pinto",25,"La Paz",date,false,0,-1));
    }
}
