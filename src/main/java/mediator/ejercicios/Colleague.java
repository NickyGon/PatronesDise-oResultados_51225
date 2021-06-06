package mediator.ejercicios;

public abstract class Colleague {
    protected iCanalDeComunicacion canalDeComunicacion;

    public Colleague(iCanalDeComunicacion mediator){
        this.canalDeComunicacion =mediator;
    }

    public abstract void send(String message);
    public abstract void messageReceived(String message);

}
