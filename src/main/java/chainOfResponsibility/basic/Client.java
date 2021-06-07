package chainOfResponsibility.basic;

public class Client {
    public static void main(String[]args){
        HandlerManager manager=new HandlerManager();
        manager.criteriaHandler(31);
    }
}
