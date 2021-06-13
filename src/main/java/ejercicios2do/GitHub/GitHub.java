package ejercicios2do.GitHub;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GitHub implements iGithub{

    //fusion entre el concreteSubject y el Caretaker

    private List<iDesarrollador> listaDesarrolladores=new ArrayList<>();
    private String nombreRepo;

    private Map<String, Memento> stateSaver=new HashMap<>();

    public void createCommit(String commitCode, Memento memento){
        System.out.println("Making commit: "+commitCode);
        System.out.println();
        stateSaver.put(commitCode,memento);
    }
    public Memento getMemento(String commitCode){
        notificar(commitCode);
        return stateSaver.get(commitCode);
    }

    public String getNombreRepo() {
        return nombreRepo;
    }

    public void setNombreRepo(String nombreRepo) {
        this.nombreRepo = nombreRepo;
    }

    @Override
    public void attach(iDesarrollador desarrollador) {
        listaDesarrolladores.add(desarrollador);
    }

    @Override
    public void detach(iDesarrollador desarrollador) {
        listaDesarrolladores.remove(desarrollador);
    }


    @Override
    public void notificar(String codigoCommit) {
        System.out.println("---Notificación de recuperación del commit "+codigoCommit+"---");
        for (iDesarrollador desarrollador:listaDesarrolladores){
            desarrollador.update("(Nueva restauración) : ");
        }
    }
}
