package state.ejemplo;

public class EncendidoMinando implements iEstadoComputadora{
    private String actionMining;

    public EncendidoMinando(String actionMining) {
        this.actionMining = actionMining;
    }

    public String getActionMining() {
        return actionMining;
    }

    public void setActionMining(String actionMining) {
        this.actionMining = actionMining;
    }

    @Override
    public void handler(Computadora computadora){
        System.out.println("Estado: Encendido y minado");
        System.out.println("INFO> action: "+actionMining);
        System.out.println("INFO> Time: "+computadora.getTimeLimit());
        TarjetaVideo tarjetaVideo=new TarjetaVideo(0,actionMining);

        for (int i=0;i<computadora.getTimeLimit();i=i+5){
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            tarjetaVideo.setPercentageUse(i);
            computadora.setTarjetaVideo(tarjetaVideo);
            System.out.println("Porcentaje de uso: "+tarjetaVideo.getPercentageUse());
        }
        System.out.println("Acción finalizada");
    }
}
