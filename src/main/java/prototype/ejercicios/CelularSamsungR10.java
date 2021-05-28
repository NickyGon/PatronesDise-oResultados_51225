package prototype.ejercicios;

public class CelularSamsungR10 implements iCelularSamsung{

    private String tamano;
    private String cpu;
    private String memoria;
    private SIM sim;
    private String versionAndroid;
    private String camara;
    private String bluetooth;
    private String cantidadDeMemoriaExterna;
    private String tipoBateria;
    private Accesory accesorios;

    public CelularSamsungR10(){

    }


    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getCantidadDeMemoriaExterna() {
        return cantidadDeMemoriaExterna;
    }

    public void setCantidadDeMemoriaExterna(String cantidadDeMemoriaExterna) {
        this.cantidadDeMemoriaExterna = cantidadDeMemoriaExterna;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public Accesory getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesory accesorios) {
        this.accesorios = accesorios;
    }


    @Override
    public Object clone() {
        CelularSamsungR10 celClone=new CelularSamsungR10();
        celClone.setTamano(this.tamano);
        celClone.setCpu(this.cpu);
        celClone.setMemoria(this.memoria);
        celClone.setSim(this.sim);
        celClone.setVersionAndroid(this.versionAndroid);
        celClone.setCamara(this.camara);
        celClone.setBluetooth(this.bluetooth);
        celClone.setCantidadDeMemoriaExterna(this.cantidadDeMemoriaExterna);
        celClone.setTipoBateria(this.tipoBateria);
        celClone.setAccesorios(this.accesorios);
        return celClone;
    }

    public void showInfo(){
        System.out.println("********CELULAR SAMSUNG R10********");
        System.out.println("Tamaño: "+ tamano);
        System.out.println("CPU: "+cpu);
        System.out.println("Memoria: " +memoria);
        System.out.println("Empresa Telefónica: "+sim.getNombreEmpresaTel());
        System.out.println("Número de Teléfono: "+sim.getNumeroTelefono());
        System.out.println("Versión de Android: "+versionAndroid);
        System.out.println("Cámara: "+camara);
        System.out.println("Bluetooth: "+bluetooth);
        System.out.println("Cantidad de Memorias Externas: "+cantidadDeMemoriaExterna);
        System.out.println("Tipo de Bateria: "+tipoBateria);
        System.out.println("Accesorio: "+accesorios.getTipo()+" "+accesorios.getModelo());
    }

}
