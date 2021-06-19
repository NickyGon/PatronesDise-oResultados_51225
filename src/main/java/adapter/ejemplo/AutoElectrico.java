package adapter.ejemplo;

public class AutoElectrico implements iElectrico{
    private int cargaMaximaBateria=100;
    private int funcionandoTime;
    private int tiempoVida=3600;
    private int tiempoCarga=0;

    public int getCargaMaximaBateria() {
        return cargaMaximaBateria;
    }

    public void setCargaMaximaBateria(int cargaMaximaBateria) {
        this.cargaMaximaBateria = cargaMaximaBateria;
    }

    public int getFuncionandoTime() {
        return funcionandoTime;
    }

    public void setFuncionandoTime(int funcionandoTime) {
        this.funcionandoTime = funcionandoTime;
    }

    public int getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public int getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(int tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    @Override
    public void cargarBateria() {
        System.out.println("Auto apagado ... Bateria : "+cargaMaximaBateria);
        System.out.println("Tiempo de vida de bateria: "+tiempoVida+" segundos");
        for (int i = 0; i < tiempoCarga; i++) {
            cargaMaximaBateria=cargaMaximaBateria+1;
        }
    }

    @Override
    public void utilizarBateria() {
        System.out.println("Estado de bateria : "+cargaMaximaBateria);
        for (int i = 0; i < funcionandoTime; i=i+5) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("... Iniciando ...");
            cargaMaximaBateria=cargaMaximaBateria-2;
            System.out.println("Estado de bateria : "+cargaMaximaBateria);
        }
        tiempoVida=tiempoVida-funcionandoTime;

    }

    @Override
    public void habilitarBateria() {
        System.out.println("Revisando Bateria. Carga de "+cargaMaximaBateria+" del 100%");
        if ( cargaMaximaBateria < 25)
            System.out.println("La energia de la bateria es menor al 25%. Se recomienda cargarlo");

    }
}
