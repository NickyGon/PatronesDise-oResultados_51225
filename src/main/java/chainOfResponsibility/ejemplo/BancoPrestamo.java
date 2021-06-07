package chainOfResponsibility.ejemplo;


public class BancoPrestamo implements iAgenteCredito {

    private iAgenteCredito next;
    @Override
    public void setNext(iAgenteCredito handler) {
        this.next=handler;
    }

    @Override
    public iAgenteCredito goNext() {
        return this.next;
    }

    @Override
    public void realizarPrestamo(Persona persona) {
        AgenteCreditoSucursal agente=new AgenteCreditoSucursal();
        this.setNext(agente);
        SupervisorCreditoSucursal supervisorAgencia=new SupervisorCreditoSucursal();
        agente.setNext(supervisorAgencia);
        SupervisorCreditoDepartamental supervisorDepartamental=new SupervisorCreditoDepartamental();
        supervisorAgencia.setNext(supervisorDepartamental);
        ConcejoPresidentes concejoPresidentes=new ConcejoPresidentes();
        supervisorDepartamental.setNext(concejoPresidentes);
        this.next.realizarPrestamo(persona);
    }
}
