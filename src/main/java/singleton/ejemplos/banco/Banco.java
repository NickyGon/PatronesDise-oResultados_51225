package singleton.ejemplos.banco;

public class Banco {
    private static Banco instance = null;
    private int saldo;
    private Banco() {
        saldo=900;
        System.out.println("Info> Iniciando saldo:"+saldo);
    }

    public static synchronized void makeInstance(){
        if (instance==null)
            instance=new Banco();
    }

    public static Banco getInstance(){
        if (instance==null)
            makeInstance();
        return instance;
    }
    public synchronized void getMoney(int amount){
        if (amount <= saldo){
            saldo=saldo-amount;
            System.out.println("Info > ---saldo: " +saldo+ " Cantidad retirada: "+amount);
        } else {
            System.out.println("Warning > --- no existe la cantidad [" +amount+ "] Saldo actual: "+saldo);
        }
    }
}
