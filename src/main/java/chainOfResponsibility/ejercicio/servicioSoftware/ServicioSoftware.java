package chainOfResponsibility.ejercicio.servicioSoftware;


public class ServicioSoftware implements iTeamScrum {

    private iTeamScrum next;

    @Override
    public void setNext(iTeamScrum handler) {
        this.next=handler;
    }

    @Override
    public iTeamScrum goNext() {
        return this.next;
    }

    @Override
    public void realizarSolicitud(Solicitud solicitud) {
        DevOps devOps=new DevOps();
        this.setNext(devOps);
        QA qa= new QA();
        devOps.setNext(qa);
        Developer developer=new Developer();
        qa.setNext(developer);
        Finanzas finanzas= new Finanzas();
        developer.setNext(finanzas);
        Support support=new Support();
        finanzas.setNext(support);
        this.next.realizarSolicitud(solicitud);
    }
}
