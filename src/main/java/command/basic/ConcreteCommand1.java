package command.basic;

public class ConcreteCommand1 implements iCommand{
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action1();
    }
}
