package chainOfResponsibility.ejercicio.servicioSoftware;


public class Developer implements iTeamScrum {

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
        if (solicitud.getTipo().equals("Nueva funcionalidad")){
          System.out.println("Nueva funcionalidad estimada: "+solicitud.getDescripcion());
        } else {
            this.next.realizarSolicitud(solicitud);
        }

    }
}
