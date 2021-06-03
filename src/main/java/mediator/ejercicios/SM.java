package mediator.ejercicios;

public class SM extends Colleague{
    private String nombre;
    private int CI;
    private String[] certificaciones;

    public SM(iCanalDeComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Mensaje recibido por SM "+nombre+"("+CI+") con certificaciones: "+listCerti(certificaciones)+": "+message);
    }

    private String listCerti(String[] certificaciones) {
        int cont=0;
        String result="";
        for (String c: certificaciones){
            result=result+c;
            cont++;
            if (cont==certificaciones.length-1 && cont<certificaciones.length)
                result=result+", ";
        }
        return result;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String[] getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String[] certificaciones) {
        this.certificaciones = certificaciones;
    }
}
