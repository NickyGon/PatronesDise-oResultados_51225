package ejercicios2do.CuerpoDeEjercito;

public class Cuartel implements iCuerpoEjercito{
    private iCuerpoEjercito siguiente;

    @Override
    public void setSiguiente(iCuerpoEjercito responsable) {
        this.siguiente=responsable;
    }

    @Override
    public iCuerpoEjercito alSiguiente() {
        return this.siguiente;
    }

    @Override
    public void realizarOrden(Orden orden) {
        General general= new General();
        this.setSiguiente(general);

        Teniente teniente= new Teniente();
        general.setSiguiente(teniente);

        Coronel coronel= new Coronel();
        teniente.setSiguiente(coronel);

        Cabo cabo= new Cabo();
        coronel.setSiguiente(cabo);
        
        this.siguiente.realizarOrden(orden);
    }
}
