package ejercicios2do.CuerpoDeEjercito;

public interface iCuerpoEjercito {
    void setSiguiente(iCuerpoEjercito responsable);
    iCuerpoEjercito alSiguiente();
    void realizarOrden(Orden orden);
}
