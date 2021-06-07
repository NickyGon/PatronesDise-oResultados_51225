package chainOfResponsibility.ejemplo;


public class ConcejoPresidentes implements iAgenteCredito {

    private iAgenteCredito next;
    @Override
    public void setNext(iAgenteCredito credito) {
        this.next=credito;
    }

    @Override
    public iAgenteCredito goNext() {
        return this.next;
    }

    @Override
    public void realizarPrestamo(Persona persona) {
        if (persona.getPrestamoSolicitado()>200000 && persona.getPrestamoSolicitado()<=300000){
            System.out.println("INFO> Prestamo aprobado por el concejo de Presidentes con el monto de: "+persona.getPrestamoSolicitado());
        } else {
            System.out.println("INFO> No se puede procesar");
        }

    }
}
