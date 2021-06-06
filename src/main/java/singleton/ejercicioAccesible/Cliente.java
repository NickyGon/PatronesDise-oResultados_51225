<<<<<<< HEAD
package singleton.ejercicioAccesible;


public class Cliente {
    public static void main(String[]args){

        Thread Jose=new Thread(new Runnable() {
            @Override
            public void run() {
                LibreCambista cambista1= new LibreCambista();
                cambista1.cambiarDinero(100,"Bs","E");
            }
        });

        Thread Maria=new Thread(new Runnable() {
            @Override
            public void run() {
                Banco banco3=new Banco();
                banco3.cambiarDinero(900,"$","E");
            }
        });

        Jose.start();
        Maria.start();

    }
}
=======
package singleton.ejercicioAccesible;


public class Cliente {
    public static void main(String[]args){

        Thread Jose=new Thread(new Runnable() {
            @Override
            public void run() {
                LibreCambista cambista1= new LibreCambista();
                cambista1.cambiarDinero(100,"Bs","E");
            }
        });

        Thread Maria=new Thread(new Runnable() {
            @Override
            public void run() {
                Banco banco3=new Banco();
                banco3.cambiarDinero(900,"$","E");
            }
        });

        Jose.start();
        Maria.start();

    }
}
>>>>>>> c840d62aee26865b3e8222b553c49398b223eec1
