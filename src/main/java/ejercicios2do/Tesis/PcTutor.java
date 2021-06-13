package ejercicios2do.Tesis;

import java.util.HashMap;
import java.util.Map;

public class PcTutor {
    private Map<String,Memento> tesisSaver= new HashMap<>();

    public void saveVersion(String id, Memento memento){
        System.out.println("Guardando versión: "+id);
        tesisSaver.put(id,memento);
        System.out.println();
    }
    public Memento getVersion(String id){
        System.out.println("Recuperando versión: "+id);
        return tesisSaver.get(id);
    }
}
