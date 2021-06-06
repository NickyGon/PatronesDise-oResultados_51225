package memento.ejemplo;

import java.util.HashMap;
import java.util.Map;


public class GitHub {
    private Map<String,Memento> stateSaver=new HashMap<>();

    public void createCommit(String commitCode, Memento memento){
        stateSaver.put(commitCode,memento);
    }
    public Memento getMemento(String commitCode){
        return stateSaver.get(commitCode);
    }
}
