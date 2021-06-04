package mediator.ejercicios;

import mediator.ejemplo.Persona;

import java.util.HashMap;
import java.util.Map;

public class Skype implements iCanalDeComunicacion{
    private Map<Integer,Colleague> mapChat=new HashMap<>();
    private DEV dev;
    private SM sm;
    private QA qa;

    public void addPersonasAlChat(Colleague colleague){
        if(colleague.getClass().getSimpleName().equals("DEV")){
            this.dev=(DEV)colleague;
            mapChat.put(this.dev.getCI(),this.dev);
        }
        if(colleague.getClass().getSimpleName().equals("QA")){
            this.qa=(QA)colleague;
            mapChat.put(this.qa.getCI(),this.qa);
        }
        if(colleague.getClass().getSimpleName().equals("SM")){
            this.sm=(SM) colleague;
            mapChat.put(this.sm.getCI(),this.sm);
        }
    }

    @Override
    public void send(String message, Colleague origen) {
        for (Map.Entry<Integer,Colleague>entryMap:mapChat.entrySet()) {
            if (origen.getClass().getSimpleName().equals("DEV")) {
                DEV parseDev = (DEV) origen;
                if (parseDev.getCI() != entryMap.getKey() && entryMap.getValue().getClass().getSimpleName().equals("DEV") ) {
                        entryMap.getValue().messageReceived(message);
                }
            } else if (origen.getClass().getSimpleName().equals("SM")){
                SM parseSm=(SM) origen;
                if (parseSm.getCI() != entryMap.getKey() ) {
                        entryMap.getValue().messageReceived(message);
                }
            } else if (origen.getClass().getSimpleName().equals("QA")){
                QA parseQa = (QA) origen;
                if (parseQa.getCI() != entryMap.getKey() && entryMap.getValue().getClass().getSimpleName().equals("QA")) {
                        entryMap.getValue().messageReceived(message);
                }
            }
        }
        System.out.println("----Fin de envio de mensajes de usuario----");
    }

}
