package ejercicios2do.CuerpoDeEjercito;

public class Coronel implements iCuerpoEjercito{

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
        if (orden.getCategoria().equals("desbloqueo")||orden.getCategoria().equals("manifestacion")){
            System.out.println("El coronel parte del cuartel hacia su encargo");
            orden.showInfo();
        } else {
            this.siguiente.realizarOrden(orden);
        }
    }
}
