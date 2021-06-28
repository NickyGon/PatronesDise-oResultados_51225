package ejercicios3parcial.instalacionelectrica;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InstalacionDeAgua implements iInstalacion{
    private int numeroConexiones;
    private int conexionesFrioCaliente;
    private Casa casa;
    private int precio=0;

    public InstalacionDeAgua(Casa casa,int numeroConexiones, int conexionesFrioCaliente) {
        this.casa=casa;
        this.numeroConexiones = numeroConexiones;
        this.conexionesFrioCaliente = conexionesFrioCaliente;
        this.precio=this.numeroConexiones+(this.conexionesFrioCaliente/2)*100;
    }

    public int getNumeroConexiones() {
        return numeroConexiones;
    }

    public void setNumeroConexiones(int numeroConexiones) {
        this.numeroConexiones = numeroConexiones;
    }

    public int getConexionesFrioCaliente() {
        return conexionesFrioCaliente;
    }

    public void setConexionesFrioCaliente(int conexionesFrioCaliente) {
        this.conexionesFrioCaliente = conexionesFrioCaliente;
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

    @Override
    public void recibirPago(iFormaDePago formaDePago, Date date) {
        System.out.println("------------------------------");
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Recibiendo el pago de la instalación de agua a "+precio+ "Bs. ");
        this.casa.info();
        System.out.println("Fecha de servicio: "+formatter.format(date));
        System.out.println("Numero de conexiones con agua fria/caliente: "+conexionesFrioCaliente);
        System.out.println("Numero de conexiones totales: "+numeroConexiones);
        formaDePago.realizarPago(this);
    }

    @Override
    public int getSpent() {
        return this.getPrecio();
    }


}
