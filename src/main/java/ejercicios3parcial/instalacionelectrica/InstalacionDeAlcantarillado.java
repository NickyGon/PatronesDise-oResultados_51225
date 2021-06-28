package ejercicios3parcial.instalacionelectrica;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InstalacionDeAlcantarillado implements iInstalacion{
    private int numeroConexiones;
    private int numeroInodoros;
    private String codigoTuberiaPrincipal;

    private Casa casa;
    private int precio=0;

    public InstalacionDeAlcantarillado(int numeroConexiones, int numeroInodoros, String codigoTuberiaPrincipal, Casa casa) {
        this.numeroConexiones = numeroConexiones;
        this.numeroInodoros = numeroInodoros;
        this.codigoTuberiaPrincipal = codigoTuberiaPrincipal;
        this.casa = casa;
        this.precio=this.numeroConexiones+(this.numeroInodoros/2)*200;
    }

    public int getNumeroConexiones() {
        return numeroConexiones;
    }

    public void setNumeroConexiones(int numeroConexiones) {
        this.numeroConexiones = numeroConexiones;
    }

    public int getNumeroInodoros() {
        return numeroInodoros;
    }

    public void setNumeroInodoros(int numeroInodoros) {
        this.numeroInodoros = numeroInodoros;
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

    public String getCodigoTuberiaPrincipal() {
        return codigoTuberiaPrincipal;
    }

    public void setCodigoTuberiaPrincipal(String codigoTuberiaPrincipal) {
        this.codigoTuberiaPrincipal = codigoTuberiaPrincipal;
    }

    @Override
    public void recibirPago(iFormaDePago formaDePago, Date date) {
        System.out.println("------------------------------");
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Recibiendo el pago de la instalación de alcantarillado a "+precio+ "Bs. ");
        this.casa.info();
        System.out.println("Fecha de servicio: "+formatter.format(date));
        System.out.println("Numero de conexión a inodoros: "+ numeroInodoros);
        System.out.println("Numero de conexiones totales: "+numeroConexiones);
        System.out.println("Código de la tubería principal conectada: "+codigoTuberiaPrincipal);
        formaDePago.realizarPago(this);
    }

    @Override
    public int getSpent() {
        return this.getPrecio();
    }


}
