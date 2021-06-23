package bridge.ejercicio.conbridge;

public class Arquitecturax86 implements iArquitectura{

    @Override
    public void senalarVersionYCaracteristicas() {
        System.out.println("Version x86");
        System.out.println("Capacidad de conexión WI-FI");
        System.out.println("Ejecutando programa de consola");
    }
}
