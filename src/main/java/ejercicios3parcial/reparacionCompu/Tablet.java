package ejercicios3parcial.reparacionCompu;

public class Tablet implements iComputadora{
    private String marca;
    private String modelo;
    private String phoneOS;
    private tamanoTablet tamanoTablet;
    private int size;
    private int precio;

    public enum tamanoTablet {
        ESTANDAR, GRANDE, XL;
    }

    public Tablet(String marca, String modelo, String phoneOS, Tablet.tamanoTablet tamanoTablet) {
        this.marca = marca;
        this.modelo = modelo;
        this.phoneOS = phoneOS;
        this.tamanoTablet = tamanoTablet;
        setTamanoTablet(tamanoTablet);
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

    public String getPhoneOS() {
        return phoneOS;
    }

    public void setPhoneOS(String phoneOS) {
        this.phoneOS = phoneOS;
    }

    public tamanoTablet getTamanoTablet() {
        return tamanoTablet;
    }

    public void setTamanoTablet(tamanoTablet tamanoTablet) {
        this.tamanoTablet = tamanoTablet;
        switch (tamanoTablet){
            case ESTANDAR:
                this.size=7 + (int)(Math.random() * ((8 - 7) + 1));
                break;
            case GRANDE:
                this.size=10;
                break;
            case XL:
                this.size=11;
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
        System.out.println("Tablet "+marca+" "+modelo);
        System.out.println("Sistema Operativo: "+phoneOS);
        System.out.println("Tamaño: "+tamanoTablet.name());
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
