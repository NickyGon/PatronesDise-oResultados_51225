package proxy.ejercicio;

import java.text.SimpleDateFormat;

public class Cuenta implements iBanco{

    private String idCuenta;
    private int montoAcumulado;
    private Persona persona;

    public Cuenta() {
    }

    public Cuenta(String idCuenta, int montoAcumulado, Persona persona) {
        this.idCuenta = idCuenta;
        this.montoAcumulado = montoAcumulado;
        this.persona = persona;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getMontoAcumulado() {
        return montoAcumulado;
    }

    public void setMontoAcumulado(int montoAcumulado) {
        this.montoAcumulado = montoAcumulado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public void comprar(int precio,iMoneda tipoMoneda) {
        String convertidoDe="";
        if (!(tipoMoneda instanceof Boliviano)){
            convertidoDe=" (convertido de "+tipoMoneda.getClass().getSimpleName()+") ";
        }
        System.out.println("---------------------------------");
        System.out.println("Se extrajo "+precio+"Bs"+convertidoDe+"en la cuenta "+idCuenta+ " a nombre de");
        persona.info();
        montoAcumulado=montoAcumulado-precio;
        System.out.println("Monto en la cuenta actual: "+montoAcumulado+ "Bs");
        System.out.println("---------------------------------");
    }


}
