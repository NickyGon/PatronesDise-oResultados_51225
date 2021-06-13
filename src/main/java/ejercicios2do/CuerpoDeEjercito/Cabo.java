package ejercicios2do.CuerpoDeEjercito;

import java.util.Locale;

public class Cabo implements iCuerpoEjercito{

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
        if (orden.getCategoria().toLowerCase().equals("limpieza")){
            System.out.println("El cabo ha de realizar la limpieza indicada");
            orden.showInfo();
        } else {
            System.out.println("No hay soldado disponible para esta operación");
        }
    }
}
