package ejercicios2do.GitHub;


public class Git {
    //Originator
    private Codigo state;

    public Git(){
    }

    public void setState(Codigo state) {
        System.out.println("**** Generando commit *****");
        state.info();
        this.state = state;
    }

    public Memento createVersion(){
        System.out.println("**** Creando commit ****");
        return new Memento(this.state);
    }
    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** Restaurando commit ****");
        this.state.info();
        System.out.println();
    }
}
