package mediator.basic;

public abstract class Colleague {
    protected iMediator mediator;

    public Colleague(iMediator mediator){
        this.mediator=mediator;
    }

    public abstract void send(String message);
    public abstract void messageReceived(String message);
}
