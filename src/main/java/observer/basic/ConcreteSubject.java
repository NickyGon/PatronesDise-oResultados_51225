package observer.basic;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements iSubject{
    private List<iObserver> observerList=new ArrayList<>();
    private String attribute1;
    private String attribute2;

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;

    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
        this.notifyObserver();
    }

    @Override
    public void attach(iObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(iObserver observer) {
        observerList.remove(observer);
    }

    /* notify observer when attribute 2 is updates

     */
    @Override
    public void notifyObserver() {
        for (iObserver observer:observerList) {
            observer.update(attribute2);
        }
    }
}
