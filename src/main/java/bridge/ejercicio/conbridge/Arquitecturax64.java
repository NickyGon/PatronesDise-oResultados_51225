package bridge.ejercicio.conbridge;

public class Arquitecturax64 implements iArquitectura{

    @Override
    public void senalarVersionYCaracteristicas() {
        System.out.println("Version x64");
        System.out.println("Capacidad de 8GB de RAM");
    }
}
