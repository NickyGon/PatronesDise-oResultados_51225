package adapter.ejemplo;

public class GasolinaEspecial implements iAutomovil{
    private int capacidad=100;
    private int cantidadDeCarga;
    private int tiempoEnMarcha;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantidadDeCarga() {
        return cantidadDeCarga;
    }

    public void setCantidadDeCarga(int cantidadDeCarga) {
        this.cantidadDeCarga = cantidadDeCarga;
    }

    public int getTiempoEnMarcha() {
        return tiempoEnMarcha;
    }

    public void setTiempoEnMarcha(int tiempoEnMarcha) {
        this.tiempoEnMarcha = tiempoEnMarcha;
    }

    @Override
    public void prender() {
        System.out.println("GasolinaEspecial Prendiendo... Tanque de combustible : "+capacidad);
    }

    @Override
    public void cargar() {
        System.out.println("Cargando...");
        if (capacidad+cantidadDeCarga <= 100)
            capacidad=capacidad+cantidadDeCarga;
        else
            System.out.println("No se puede, sobrepasa el 100% de capacidad");
    }

    @Override
    public void utilizarAutomovil() {
        System.out.println("Iniciando ...");
        for (int i = 0; i < tiempoEnMarcha; i=i+5) {
            try {
                Thread.sleep(5*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            capacidad=capacidad-5;
            if (capacidad <= 0){
                System.out.println("Sin combustible ..");
                break;
            }
        }


    }
}
