package ejercicios3parcial.reparacionCompu;

public class AccesoACuenta {
    public AccesoACuenta(){
        CuentaUnica.getInstance();
    }

    public void realizarReparacion(iComputadora computadora){
        CuentaUnica.getInstance().repairComputadora(computadora);
    }

    public void realizarPago(int precio,iComputadora computadora){
        CuentaUnica.getInstance().pagar(precio,computadora);
    }
}
