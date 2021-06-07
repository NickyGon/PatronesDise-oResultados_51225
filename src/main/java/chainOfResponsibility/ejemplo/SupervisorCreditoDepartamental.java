package chainOfResponsibility.ejemplo;


public class SupervisorCreditoDepartamental implements iAgenteCredito {

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
        if (persona.getPrestamoSolicitado()>100000 && persona.getPrestamoSolicitado()<=200000){
            System.out.println("INFO> Prestamo aprobado por el supervisor de creditos departamental con el monto de: "+persona.getPrestamoSolicitado());
        } else {
            this.next.realizarPrestamo(persona);
        }

    }
}
