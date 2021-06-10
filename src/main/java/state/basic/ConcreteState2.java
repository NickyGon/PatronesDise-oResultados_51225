package state.basic;

public class ConcreteState2 implements iState{

    @Override
    public void handler() {
        System.out.println("INFO> State2 behavior");
    }
}
