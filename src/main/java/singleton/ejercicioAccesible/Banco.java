<<<<<<< HEAD
package singleton.ejercicioAccesible;

public class Banco {
    public Banco(){
        EmpresaDeCambio.getInstance().info("Entrando a banco");
    }
    public void cambiarDinero(int cantidad,String tipo,String objetivo){
        EmpresaDeCambio.getInstance().getChange("B",cantidad,tipo,objetivo);
    }
}
=======
package singleton.ejercicioAccesible;

public class Banco {
    public Banco(){
        EmpresaDeCambio.getInstance().info("Entrando a banco");
    }
    public void cambiarDinero(int cantidad,String tipo,String objetivo){
        EmpresaDeCambio.getInstance().getChange("B",cantidad,tipo,objetivo);
    }
}
>>>>>>> c840d62aee26865b3e8222b553c49398b223eec1
