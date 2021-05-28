package prototype.ejercicios;

public class Cliente {
    public static void main(String[]args){
        CelularSamsungR10 cel= new CelularSamsungR10();
        cel.setTamano("157.6 x 74.1 x 7.8 mm");
        cel.setCpu("Exynos 9820");
        cel.setMemoria("128 GB");
        cel.setCamara("8 MP");
        cel.setSim(new SIM("",""));
        cel.setVersionAndroid("9 Pie");
        cel.setBluetooth("5.0");
        cel.setCantidadDeMemoriaExterna("512 GB");
        cel.setTipoBateria("3400 mAh, tipica");
        cel.setAccesorios(new Accesory("",""));

        CelularSamsungR10 CelR10=(CelularSamsungR10) cel.clone();
        CelR10.setSim(new SIM("Entel","76767770"));
        CelR10.setAccesorios(new Accesory("Auriculares","Galaxy Buds"));

        CelularSamsungR10 Cel2R10=(CelularSamsungR10) cel.clone();
        Cel2R10.setSim(new SIM("Viva","78345761"));
        Cel2R10.setAccesorios(new Accesory("Cargador","USB tipo C"));

        CelularSamsungR10 Cel3R10=(CelularSamsungR10) cel.clone();
        Cel3R10.setSim(new SIM("Viva","76008979"));
        Cel3R10.setAccesorios(new Accesory("Estuche","Spigen Rígido Negro Mate"));

        CelR10.showInfo();
        Cel2R10.showInfo();
        Cel3R10.showInfo();
    }
}
