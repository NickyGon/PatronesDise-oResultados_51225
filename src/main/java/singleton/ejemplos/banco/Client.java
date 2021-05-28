package singleton.ejemplos.banco;

public class Client {

    public static void main (String[]args){
        Thread Jose=new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero cajeroLP= new Cajero();
                cajeroLP.retirarDinero("UPB",100);
            }
        });

        Thread Maria=new Thread(new Runnable() {
            @Override
            public void run() {
               BancaMovil bancaMovil=new BancaMovil();
               bancaMovil.retirarDinero("UPB",200);
            }
        });

        Thread Marcelo=new Thread(new Runnable() {
            @Override
            public void run() {
                Sucursal sucursalCBBA=new Sucursal();
                sucursalCBBA.retirarDinero("UPB",300);
            }
        });

        Jose.start();
        Maria.start();
        Marcelo.start();
    }
}
