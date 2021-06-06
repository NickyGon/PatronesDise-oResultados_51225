<<<<<<< HEAD
package mediator.ejercicios;

public class QA extends Colleague{
    private String nombre;
    private int CI;
    private int grado;

    public QA(iCanalDeComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Mensaje recibido por QA "+nombre+"("+CI+") con grado "+grado+": "+message);
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

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
}
=======
package mediator.ejercicios;

public class QA extends Colleague{
    private String nombre;
    private int CI;
    private int grado;

    public QA(iCanalDeComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Mensaje recibido por QA "+nombre+"("+CI+") con grado "+grado+": "+message);
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

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
}
>>>>>>> c840d62aee26865b3e8222b553c49398b223eec1
