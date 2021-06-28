package ejercicios3parcial.reparacionCompu;

public class Laptop implements iComputadora{
    private String marca;
    private String modelo;
    private boolean bluetooth;
    private tamanoLaptop tamanoLaptop;
    private int size;
    private int precio;

    public enum tamanoLaptop{
        PORTATIL,TRANSPORTABLE,ESTANDAR,ALTARESOLUCION;
    }

    public Laptop(String marca, String modelo, boolean bluetooth,tamanoLaptop tamanoLaptop) {
        this.marca = marca;
        this.modelo = modelo;
        this.bluetooth = bluetooth;
        this.tamanoLaptop=tamanoLaptop;
        setTamanoLaptop(tamanoLaptop);
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

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public Laptop.tamanoLaptop getTamanoLaptop() {
        return tamanoLaptop;
    }

    public void setTamanoLaptop(Laptop.tamanoLaptop tamanoLaptop) {
        this.tamanoLaptop = tamanoLaptop;
        switch (tamanoLaptop){
            case PORTATIL:
                this.size=11 + (int)(Math.random() * ((12 - 11) + 1));
                break;
            case TRANSPORTABLE:
                this.size=13 + (int)(Math.random() * ((14 - 13) + 1));
                break;
            case ESTANDAR:
                this.size=15;
                break;
            case ALTARESOLUCION:
                this.size=17;
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
        System.out.println("Laptop "+marca+" "+modelo);
        System.out.println("Conexión Bluetooth: "+bluetooth);
        System.out.println("Tamaño: "+tamanoLaptop.name());
        System.out.println("------------------");
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public void obtainPrecio() {
        precio=100*size;
        System.out.println("** Monto a pagar de la reparación: "+precio+" Bs");

    }
}
