package ejercicios2do.Extra;

public class Supervisor implements iPersonalBanco{
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
        if (monto>(cuenta.getPrestamoApagar()*(0.5))&&monto<(cuenta.getPrestamoApagar())){
            System.out.println("El supervisor recibe el pago del cliente "+cuenta.getPersona().getNombre());
            cuenta.showCuenta();
            System.out.println("Monto pagado: "+monto+"Bs.");
            System.out.println("A partir de este punto, el Banco le ofrece nuevos préstamos Solidaridad Unida para beneficiar su vida. Consultar con el Banco para más información");
        } else{
            this.siguiente.realizarAccion(cuenta,monto);
        }
    }
}
