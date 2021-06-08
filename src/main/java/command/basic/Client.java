package command.basic;

public class Client {
    public static void main(String[]args){
        Receiver receiver=new Receiver();
        ConcreteCommand1 command1=new ConcreteCommand1(receiver);
        ConcreteCommand2 command2=new ConcreteCommand2(receiver);
        ConcreteCommand1 command3=new ConcreteCommand1(receiver);
        Invoker mainCMD= new Invoker();

        mainCMD.addCommand(command3);
        mainCMD.addCommand(command1);
        mainCMD.addCommand(command2);

        mainCMD.executeCommand();
    }
}
