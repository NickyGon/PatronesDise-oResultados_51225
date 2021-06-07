package chainOfResponsibility.ejemplo;


public class AgenteCreditoSucursal implements iAgenteCredito {

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
        if (persona.getPrestamoSolicitado()<=50000){
            System.out.println("INFO> Prestamo aprobado por el agente de la sucursal con el monto de: "+persona.getPrestamoSolicitado());
        } else {
            this.next.realizarPrestamo(persona);
        }

    }
}
