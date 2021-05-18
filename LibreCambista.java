package singleton.ejercicios;

public class LibreCambista {
    public LibreCambista(){
        EmpresaDeCambio.getInstance().info("Contactando Libre Cambista");
    }
    public void cambiarDinero(int cantidad,String tipo,String objetivo){
        System.out.print("LC");
        EmpresaDeCambio.getInstance().getChange(cantidad,tipo,objetivo);
    }
}
