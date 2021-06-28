package ejercicios3parcial.instalacionelectrica;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cliente {
   public static void main(String[]args){
       iFormaDePago tigoMoney= new PagoTigoMoney();
       iFormaDePago efectivo= new PagoEfectivo();
       iFormaDePago transfer= new PagoTransferencia();
       iFormaDePago appEmpresa= new PagoAppEmpresa();

       Casa casa1= new Casa("Av Ballivian, Esquina 18 de los Alamos",2,false,456);
       Casa casa2= new Casa("Av Ballivian, Esquina 19 de los Alamos",1,true,459);

       iInstalacion electrica= new InstalacionElectrica(13,4,6,casa1);
       electrica.recibirPago(appEmpresa,new Date(System.currentTimeMillis()));
       //supongamos que van a arreglar a la misma casa una fecha despues
       Calendar calendar= new GregorianCalendar(2021,Calendar.AUGUST,20);
       electrica.recibirPago(tigoMoney,calendar.getTime());

       iInstalacion alcantarilla= new InstalacionDeAlcantarillado(15,2,"CR323",casa2);
       alcantarilla.recibirPago(efectivo,new Date(System.currentTimeMillis()));

       iInstalacion agua= new InstalacionDeAgua(casa2,17,4);
       agua.recibirPago(transfer,calendar.getTime());
   }
}
