package memento.ejercicios;


import java.util.LinkedHashMap;
import java.util.Map;

public class SQL {
    private Map<String,Personas> personasStateMap;
    private Personas state;
    public SQL(){
        personasStateMap=new LinkedHashMap<>();
    }

    public void setBackup(Personas state) {
        System.out.println("----Set Database Backup----");
        personasStateMap.put(state.getCi(),state);
        for (Map.Entry<String,Personas>mapEntry:personasStateMap.entrySet()) {
            mapEntry.getValue().showInfo();
        }
        this.state = state;
    }

    public Memento createBackupVersion(){
        System.out.println("-----Creating DataBase Backup-----");
        return new Memento(this.state);
    }
    public void restoreBackup(Memento memento){
        this.state=memento.getState();
        System.out.println("----DataBase Backup restored----");
        for (Map.Entry<String,Personas>mapEntry:personasStateMap.entrySet()){
                mapEntry.getValue().showInfo();
            if (mapEntry.getKey().equals(this.state.getCi())){
                break;
            }
        }
    }

}
