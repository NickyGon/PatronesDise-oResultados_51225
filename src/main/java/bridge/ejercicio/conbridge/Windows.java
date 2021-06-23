package bridge.ejercicio.conbridge;

public class Windows implements iPlataforma{
    private iArquitectura arquitectura;
    public Windows(iArquitectura arquitectura){
        this.arquitectura= arquitectura;
    }
    @Override
    public void ejecutar() {
        System.out.println("Windows");
        arquitectura.senalarVersionYCaracteristicas();
        System.out.println("Ejecutando reproductor");
    }
}
