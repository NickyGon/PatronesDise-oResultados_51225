package ejercicios2do.Whatsapp;



import observer.ejercicio.Notificacion;

import java.util.HashMap;
import java.util.Map;

public class Whatsapp implements iAppComunicacion{

    private Map<Integer, Persona> grupoWhatsapp =new HashMap<>();

    public void addAlGrupo(Persona persona){grupoWhatsapp.put(persona.getTelefono(),persona);}

    @Override
    public void enviar(String mensaje, Colleague usuarioOrigen,String destinatario) {
        if (destinatario.equals("")){
            System.out.println("---Notificación grupal!---");
        } else {
            System.out.println("---Notificación 1 a 1---");
        }
        Persona personaOrigen=(Persona) usuarioOrigen;
        for (Map.Entry<Integer,Persona>entryMap: grupoWhatsapp.entrySet()){
            if (personaOrigen.getTelefono()!=entryMap.getValue().getTelefono()){
                if (entryMap.getValue().getNombre().equals(destinatario) && !destinatario.equals("")){
                    entryMap.getValue().mensajeRecibido(mensaje);
                } else if (destinatario.equals("")){
                    entryMap.getValue().mensajeRecibido(mensaje);
                }
            }
        }
    }
}
