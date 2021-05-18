package singleton.ejercicios;

public class CasaDeCambio {
    public CasaDeCambio(){
        EmpresaDeCambio.getInstance().info("Entrando a casa de cambio");
    }
    public void cambiarDinero(int cantidad,String tipo,String objetivo){
        System.out.print("CC");
        EmpresaDeCambio.getInstance().getChange(cantidad,tipo,objetivo);
    }
}
