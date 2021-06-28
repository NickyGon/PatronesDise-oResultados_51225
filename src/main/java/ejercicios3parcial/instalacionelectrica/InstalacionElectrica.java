package ejercicios3parcial.instalacionelectrica;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InstalacionElectrica implements iInstalacion{
    private int numeroConexiones;
    private int numeroInterruptores;
    private int numeroLuces;

    private Casa casa;
    private int precio=0;

    public InstalacionElectrica(int numeroConexiones, int numeroInterruptores, int numeroLuces, Casa casa) {
        this.numeroConexiones = numeroConexiones;
        this.numeroInterruptores = numeroInterruptores;
        this.numeroLuces = numeroLuces;
        this.casa = casa;
        this.precio=this.numeroConexiones+(this.getNumeroConexiones()+this.numeroLuces/2)*150;
    }


    public int getNumeroConexiones() {
        return numeroConexiones;
    }

    public void setNumeroConexiones(int numeroConexiones) {
        this.numeroConexiones = numeroConexiones;
    }

    public int getNumeroInterruptores() {
        return numeroInterruptores;
    }

    public void setNumeroInterruptores(int numeroInterruptores) {
        this.numeroInterruptores = numeroInterruptores;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumeroLuces() {
        return numeroLuces;
    }

    public void setNumeroLuces(int numeroLuces) {
        this.numeroLuces = numeroLuces;
    }

    @Override
    public void recibirPago(iFormaDePago formaDePago, Date date) {
        System.out.println("------------------------------");
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Recibiendo el pago de la instalación electrica a "+precio+ "Bs. ");
        this.casa.info();
        System.out.println("Fecha de servicio: "+formatter.format(date));
        System.out.println("Numero de interruptores en la caja maestra: "+ numeroInterruptores);
        System.out.println("Numero de conexiones totales: "+numeroConexiones);
        System.out.println("Numero de conexiones a Luz: "+numeroLuces);
        formaDePago.realizarPago(this);
    }

    @Override
    public int getSpent() {
        return this.getPrecio();
    }


}
