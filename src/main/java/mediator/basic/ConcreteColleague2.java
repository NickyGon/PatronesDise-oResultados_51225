package mediator.basic;

public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(iMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO> Mensaje recibido C2: "+message);
    }
}
