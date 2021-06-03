package mediator.basic;

public class Client {
    public static void main(String[]args){
        ConcreteMediator mediator=new ConcreteMediator();
        ConcreteColleague colleague1=new ConcreteColleague(mediator);
        ConcreteColleague2 colleague2=new ConcreteColleague2(mediator);

        mediator.setUser1(colleague1);
        mediator.setUser2(colleague2);

        colleague1.send("Hola");
        System.out.println("***");
        colleague2.send("Henlo");

    }
}
