package chainOfResponsibility.ejercicio.servicioSoftware;


public class Finanzas implements iTeamScrum {

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
        if (solicitud.getTipo().equals("Costos")){
          System.out.println("Analizando la solicitud para Finanzas: "+solicitud.getDescripcion());
        } else {
            this.next.realizarSolicitud(solicitud);
        }

    }
}
