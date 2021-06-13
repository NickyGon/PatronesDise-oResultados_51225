package ejercicios2do.Whatsapp;

public abstract class Colleague {
    protected iAppComunicacion appComunicacion;

    public Colleague(iAppComunicacion mediador){this.appComunicacion=mediador;}

    public abstract void enviar(String message,String destinatario);
    public abstract void mensajeRecibido(String message);
}
