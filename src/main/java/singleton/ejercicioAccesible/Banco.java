package singleton.ejercicioAccesible;

public class Banco {
    public Banco(){
        EmpresaDeCambio.getInstance().info("Entrando a banco");
    }
    public void cambiarDinero(int cantidad,String tipo,String objetivo){
        EmpresaDeCambio.getInstance().getChange("B",cantidad,tipo,objetivo);
    }
}
