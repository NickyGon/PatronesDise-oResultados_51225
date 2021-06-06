package singleton.ejercicioAccesible;

public class LibreCambista {
    public LibreCambista(){
        EmpresaDeCambio.getInstance().info("Contactando Libre Cambista");
    }
    public void cambiarDinero(int cantidad,String tipo,String objetivo){
        EmpresaDeCambio.getInstance().getChange("LC",cantidad,tipo,objetivo);
    }
}
