package memento.basic;

import java.util.ArrayList;
import java.util.List;

public class Carataker {
    private List<Memento> stateSaver=new ArrayList<>();

    public void addMemento(Memento memento){
        stateSaver.add(memento);
    }

    public Memento getMemento(int statePosition){
        return stateSaver.get(statePosition);
    }
}
