package state.basic;

public class Context {
    private iState iState;

    public iState getiState() {
        return iState;
    }

    public void setiState(iState iState) {
        this.iState = iState;
    }

    public void request(){
        this.iState.handler();
    }
}
