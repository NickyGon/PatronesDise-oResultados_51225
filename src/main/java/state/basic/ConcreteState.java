package state.basic;

public class ConcreteState implements iState{

    @Override
    public void handler() {
        System.out.println("INFO> State1 behavior");
    }
}
