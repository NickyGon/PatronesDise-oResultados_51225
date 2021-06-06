<<<<<<< HEAD
package singleton.ejercicioAccesible;

public class CasaDeCambio {
    public CasaDeCambio(){
        EmpresaDeCambio.getInstance().info("Entrando a casa de cambio");
    }
    public void cambiarDinero(int cantidad,String tipo,String objetivo){
        EmpresaDeCambio.getInstance().getChange("CC",cantidad,tipo,objetivo);
    }
}
=======
package singleton.ejercicioAccesible;

public class CasaDeCambio {
    public CasaDeCambio(){
        EmpresaDeCambio.getInstance().info("Entrando a casa de cambio");
    }
    public void cambiarDinero(int cantidad,String tipo,String objetivo){
        EmpresaDeCambio.getInstance().getChange("CC",cantidad,tipo,objetivo);
    }
}
>>>>>>> c840d62aee26865b3e8222b553c49398b223eec1
