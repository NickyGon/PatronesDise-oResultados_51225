package ejercicios2do.Extra;

public class Encargado implements iPersonalBanco{
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
        if (monto==cuenta.getPrestamoApagar()){
            System.out.println("El encargado de préstamos recibe el pago del cliente "+cuenta.getPersona().getNombre());
            cuenta.showCuenta();
            System.out.println("Monto pagado: "+monto+"Bs.");
            System.out.println("Gracias por utilizar el servicio de préstamos del Banco. Sus documentos serán devueltos. Buen día");
            cuenta.getPersona().showInfo();
            System.exit(0);
        } else {
            int cambio=monto-cuenta.getPrestamoApagar();
            System.out.println("Prestamo pedido: "+cuenta.getPrestamoApagar()+"Bs. Monto pagado: "+monto+"Bs.");
            System.out.println("Estimado cliente, ha excedido el monto a pagar. El encargado de préstamos aceptará su pago, con un cambio de: "+cambio+"Bs");
            System.out.println("Espere unos segundos hasta que se devuelvan sus documentos: ");
            try{
                Thread.sleep(10000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            cuenta.getPersona().showInfo();
            System.out.println("Gracias por su cooperación");
            System.exit(0);
        }
    }
}
