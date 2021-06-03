package mediator.basic;

public class ConcreteColleague extends Colleague{

    public ConcreteColleague(iMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO> Mensaje recibido C1: "+message);
    }
}
