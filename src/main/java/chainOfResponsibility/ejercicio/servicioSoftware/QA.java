package chainOfResponsibility.ejercicio.servicioSoftware;


public class QA implements iTeamScrum {

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
        if (solicitud.getTipo().equals("Bug")||solicitud.getTipo().equals("Mejora")){
          System.out.println("Se realizó el aislamiento del error/mejora: "+solicitud.getDescripcion());
        } else {
            this.next.realizarSolicitud(solicitud);
        }

    }
}
