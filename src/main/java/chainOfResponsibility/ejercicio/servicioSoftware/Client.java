package chainOfResponsibility.ejercicio.servicioSoftware;


public class Client {
    public static void main(String[]args){
       ServicioSoftware servicioSoftware=new ServicioSoftware();
       servicioSoftware.realizarSolicitud(new Solicitud("Costos","Revisar las estimaciones de costo de escalamiento"));
       servicioSoftware.realizarSolicitud(new Solicitud("Bug","Arreglar el congelamiento del scroll screen"));
       servicioSoftware.realizarSolicitud(new Solicitud("Mejora","Optimizar el tiempo de devolución de datos"));
       servicioSoftware.realizarSolicitud(new Solicitud("Infraestructura","Cerrado de la aplicación a los 32 segundos de ejecucion"));
       servicioSoftware.realizarSolicitud(new Solicitud("Nueva funcionalidad","Conexión a Google y Facebook"));
       servicioSoftware.realizarSolicitud(new Solicitud("Arreglo","Actualización del software de desarrollo"));

    }
}
