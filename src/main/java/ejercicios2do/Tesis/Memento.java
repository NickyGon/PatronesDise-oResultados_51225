package ejercicios2do.Tesis;

public class Memento {
    public Tesis state;
    public Memento(Tesis versionGuardada){this.state=versionGuardada;}
    public Tesis getVersion(){return state;}
}
