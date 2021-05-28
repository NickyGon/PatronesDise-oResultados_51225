package singleton.ejemplos.banco;

public class Sucursal {

    public Sucursal(){

    }

    public void retirarDinero(String cuenta, int cantidad){
        System.out.println("Cuenta: "+cuenta);
        Banco.getInstance().getMoney(cantidad);
    }

}
