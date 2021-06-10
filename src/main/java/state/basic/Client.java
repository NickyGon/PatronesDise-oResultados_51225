package state.basic;

public class Client {
    public static void main(String[]args){
        iState iState= new ConcreteState();
        iState iState1=new ConcreteState2();
        iState iState2=new ConcreteState3();

        Context context=new Context();

        context.setiState(iState);
        context.request();

        context.setiState(iState1);
        context.request();

        context.setiState(iState2);
        context.request();
    }
}
