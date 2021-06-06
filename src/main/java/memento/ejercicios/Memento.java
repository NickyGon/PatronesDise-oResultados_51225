package memento.ejercicios;

public class Memento {
    private Personas state;

    public Memento(Personas stateSaved){this.state =stateSaved;}

    public Personas getState(){
        return state;
    }

}
