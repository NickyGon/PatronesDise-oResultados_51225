package ejercicios2do.Extra;

public class Banco {
    public Banco(){VentanillaBanco.getInstance();}
    public void pagarPrestamo(int monto,Cuenta cuenta){
        VentanillaBanco.getInstance().info("Ingresando al sistema");
        VentanillaBanco.getInstance().realizarAccion(cuenta,monto);
    }
}
