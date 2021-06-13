package ejercicios2do.CuerpoDeEjercito;

public class Teniente implements iCuerpoEjercito{

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
        if (orden.getCategoria().toLowerCase().equals("disciplina")){
            System.out.println("El teniente iniciará su rutina");
            orden.showInfo();
        } else {
            this.siguiente.realizarOrden(orden);
        }
    }
}
