<<<<<<< HEAD
package singleton.ejercicioAccesible;

public class LibreCambista {
    public LibreCambista(){
        EmpresaDeCambio.getInstance().info("Contactando Libre Cambista");
    }
    public void cambiarDinero(int cantidad,String tipo,String objetivo){
        EmpresaDeCambio.getInstance().getChange("LC",cantidad,tipo,objetivo);
    }
}
=======
package singleton.ejercicioAccesible;

public class LibreCambista {
    public LibreCambista(){
        EmpresaDeCambio.getInstance().info("Contactando Libre Cambista");
    }
    public void cambiarDinero(int cantidad,String tipo,String objetivo){
        EmpresaDeCambio.getInstance().getChange("LC",cantidad,tipo,objetivo);
    }
}
>>>>>>> c840d62aee26865b3e8222b553c49398b223eec1
