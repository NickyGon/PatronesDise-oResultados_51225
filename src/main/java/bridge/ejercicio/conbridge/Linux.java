package bridge.ejercicio.conbridge;

public class Linux implements iPlataforma{
    private iArquitectura arquitectura;
    public Linux(iArquitectura arquitectura){
        this.arquitectura= arquitectura;
    }
    @Override
    public void ejecutar() {
        System.out.println("Linux");
        arquitectura.senalarVersionYCaracteristicas();
    }
}
