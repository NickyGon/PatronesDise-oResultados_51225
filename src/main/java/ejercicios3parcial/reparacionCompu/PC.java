package ejercicios3parcial.reparacionCompu;

public class PC implements iComputadora{
    private String marca;
    private String modelo;
    private boolean wireless;
    private tamanoPC tamanoPC;
    private int size;
    private int precio;

    public enum tamanoPC {
        MINI, MICRO, MID, FULL;
    }

    public PC(String marca, String modelo, boolean wireless, tamanoPC tamanoPC) {
        this.marca = marca;
        this.modelo = modelo;
        this.wireless = wireless;
        this.tamanoPC = tamanoPC;
        setTamanoPC(tamanoPC);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public tamanoPC getTamanoPC() {
        return tamanoPC;
    }

    public void setTamanoPC(tamanoPC tamanoPC) {
        this.tamanoPC = tamanoPC;
        switch (tamanoPC){
            case MINI:
                this.size=289;
                break;
            case MICRO:
                this.size=576;
                break;
            case MID:
                this.size=720;
                break;
            case FULL:
                this.size=5625;
                break;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public void reparar(iReparacion reparacion) {
       reparacion.llevarkit(this);
    }

    @Override
    public void getInfo() {
        System.out.println("------------------");
        System.out.println("PC "+marca+" "+modelo);
        System.out.println("Conexión Wireless: "+wireless);
        System.out.println("Tamaño: "+tamanoPC.name());
        System.out.println("------------------");
    }

    public int getPrecio() {
        return precio;
    }

    @Override

    public void obtainPrecio() {
        precio=10*size;
        System.out.println("** Monto a pagar de la reparación: "+precio+" Bs");
    }
}
