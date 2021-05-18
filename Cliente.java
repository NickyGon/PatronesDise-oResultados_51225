package singleton.ejercicios;

public class Cliente {
    public static void main(String[]args){
        CasaDeCambio cc1=new CasaDeCambio();
        cc1.cambiarDinero(70,"Bs","$");
        CasaDeCambio cc2=new CasaDeCambio();
        cc2.cambiarDinero(80,"E","Bs");
        LibreCambista lb1=new LibreCambista();
        lb1.cambiarDinero(90,"Bs","$");
        
    }
}
