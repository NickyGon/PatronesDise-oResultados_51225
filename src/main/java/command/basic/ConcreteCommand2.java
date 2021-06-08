package command.basic;

public class ConcreteCommand2 implements iCommand{
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action2();
    }
}
