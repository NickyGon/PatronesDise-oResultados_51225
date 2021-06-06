package memento.ejercicios;

import java.util.HashMap;
import java.util.Map;

public class BaseDeDatos {
    private Map<String, Memento> backupSaver=new HashMap<>();

    public void createBackup(String alias, Memento memento){
        System.out.println("Making backup: "+alias);
        backupSaver.put(alias,memento);
        System.out.println();
    }

    public Memento getMemento(String alias){
        System.out.println("Restoring backup: "+alias);
        return backupSaver.get(alias);
    }

}
