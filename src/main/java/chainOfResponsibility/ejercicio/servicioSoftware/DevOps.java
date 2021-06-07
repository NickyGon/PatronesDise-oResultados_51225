package chainOfResponsibility.ejercicio.servicioSoftware;


public class DevOps implements iTeamScrum {

    private iTeamScrum next;
    @Override
    public void setNext(iTeamScrum credito) {
        this.next=credito;
    }

    @Override
    public iTeamScrum goNext() {
        return this.next;
    }

    @Override
    public void realizarSolicitud(Solicitud solicitud) {
        if (solicitud.getTipo().equals("Infraestructura")){
          System.out.println("Información del error para DevOps: "+solicitud.getDescripcion());
        } else {
            this.next.realizarSolicitud(solicitud);
        }

    }
}
