package ejercicios2do.Tesis;



public class CarpetaTesis {
    private Tesis state;
    public CarpetaTesis(){}

    public void guardarVersion(Tesis state){
        System.out.println("---Guardando version de la tesis---");
        state.info();
        this.state=state;
    }

    public Memento crearVersion(){
        System.out.println("***Creando versión***");
        return new Memento(this.state);
    }

    public void restaurarVersion(Memento memento){
        this.state=memento.getVersion();
        System.out.println("---Recuperando versión---");
        this.state.info();
    }
}
