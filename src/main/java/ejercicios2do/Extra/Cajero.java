package ejercicios2do.Extra;

public class Cajero implements iPersonalBanco{
    private iPersonalBanco siguiente;
    @Override
    public void setSiguiente(iPersonalBanco personal) {
        this.siguiente=personal;
    }

    @Override
    public iPersonalBanco alSiguiente() {
        return this.siguiente;
    }

    @Override
    public void realizarAccion(Cuenta cuenta, int monto) {
        if (monto<(cuenta.getPrestamoApagar()*(0.25))){
            System.out.println("El cajero recibe el pago del cliente "+cuenta.getPersona().getNombre());
            cuenta.showCuenta();
            System.out.println("Monto pagado: "+monto+"Bs.");
        } else{
            this.siguiente.realizarAccion(cuenta,monto);
        }
    }
}
