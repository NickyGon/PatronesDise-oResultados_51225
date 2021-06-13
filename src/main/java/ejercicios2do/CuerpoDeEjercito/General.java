package ejercicios2do.CuerpoDeEjercito;

public class General implements iCuerpoEjercito{

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
        if (orden.getCategoria().toLowerCase().equals("entrevistas")){
            System.out.println("El general estará disponible para la petición indicada");
            orden.showInfo();
        } else {
            this.siguiente.realizarOrden(orden);
        }
    }
}
