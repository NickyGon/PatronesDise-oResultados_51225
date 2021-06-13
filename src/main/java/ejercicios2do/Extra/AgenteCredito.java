package ejercicios2do.Extra;

public class AgenteCredito implements iPersonalBanco{
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
        if (monto>=(cuenta.getPrestamoApagar()*(0.25))&&monto<=(cuenta.getPrestamoApagar()*(0.5))){
            System.out.println("El agente de crédito recibe el pago del cliente "+cuenta.getPersona().getNombre());
            cuenta.showCuenta();
            System.out.println("Monto pagado: "+monto+"Bs.");
            System.out.println("Si se desea, se tiene la posibilidad de extender su plazo hasta 6 meses. Consultar con el Banco para más información");
        } else{
            this.siguiente.realizarAccion(cuenta,monto);
        }
    }
}
