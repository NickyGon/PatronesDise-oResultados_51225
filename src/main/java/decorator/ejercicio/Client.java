package decorator.ejercicio;

public class Client {
    public static void  main(String[]args){
        Banco cuenta= new BancoCliente(3000,"3j92j");
        cuenta=new Promocion(cuenta);
        cuenta=new BancaPorInternet(cuenta,true);
        cuenta= new SeguroCuenta(cuenta,50);

        cuenta.realizarOperacion();
    }
}
