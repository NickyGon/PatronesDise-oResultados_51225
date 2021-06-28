package ejercicios3parcial.reparacionCompu;

public interface iComunicacion {
    void attach(iUsuario usuario);
    void detach(iUsuario usuario);
    void notifyUser(iComputadora computadora,int montoAcumulado);
}
