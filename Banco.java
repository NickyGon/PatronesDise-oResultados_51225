package singleton.ejercicios;

public class Banco {
    public Banco(){
        EmpresaDeCambio.getInstance().info("Entrando a banco");
    }
    public void cambiarDinero(int cantidad,String tipo,String objetivo){
        System.out.print("B");
        EmpresaDeCambio.getInstance().getChange(cantidad,tipo,objetivo);
    }
}
