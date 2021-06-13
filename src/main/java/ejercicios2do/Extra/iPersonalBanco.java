package ejercicios2do.Extra;

public interface iPersonalBanco {
    void setSiguiente(iPersonalBanco personal);
    iPersonalBanco alSiguiente();
    void realizarAccion(Cuenta cuenta,int monto);
}
