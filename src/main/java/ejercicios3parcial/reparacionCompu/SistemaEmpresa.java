package ejercicios3parcial.reparacionCompu;

import java.util.ArrayList;
import java.util.List;

public class SistemaEmpresa implements iComunicacion{
    List<iUsuario> usuariosEmpersa= new ArrayList<>();
    @Override
    public void attach(iUsuario usuario) {
        usuariosEmpersa.add(usuario);
    }

    @Override
    public void detach(iUsuario usuario) {
        usuariosEmpersa.remove(usuario);
    }

    @Override
    public void notifyUser(iComputadora computadora,int montoacumulado) {
        for (iUsuario usuario: usuariosEmpersa){
            usuario.notify("Se hizo un nuevo pago en la cuenta única de la reparación de un computador tipo "+computadora.getClass().getSimpleName()
                    +" La empresa tiene hasta ahora "+montoacumulado+"Bs en su caja");
        }
    }
}
