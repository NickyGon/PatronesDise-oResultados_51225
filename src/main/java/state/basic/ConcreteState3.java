package state.basic;

public class ConcreteState3 implements iState{

    @Override
    public void handler() {
        System.out.println("INFO> State3 behavior");
    }
}
