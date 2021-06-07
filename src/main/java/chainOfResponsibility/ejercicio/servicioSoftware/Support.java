package chainOfResponsibility.ejercicio.servicioSoftware;


public class Support implements iTeamScrum {

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
        if (!solicitud.getTipo().equals("Bug")&&!solicitud.getTipo().equals("Mejora")&&!solicitud.getTipo().equals("Costos")&&!solicitud.getTipo().equals("Nueva funcionalidad")&&!solicitud.getTipo().equals("Infraestructura")){
          System.out.println("El support ha revisado su solicitud: "+solicitud.getDescripcion());
        }

    }
}
