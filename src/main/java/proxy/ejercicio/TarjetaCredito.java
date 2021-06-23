package proxy.ejercicio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TarjetaCredito implements iBanco{
    private String id;
    private Date vence;
    private Cuenta usuario;

    private int spent=0;

    public TarjetaCredito(String id, Date vence, Cuenta usuario) {
        this.id = id;
        this.vence = vence;
        this.usuario = usuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getVence() {
        return vence;
    }

    public void setVence(Date vence) {
        this.vence = vence;
    }

    public Cuenta getUsuario() {
        return usuario;
    }

    public void setUsuario(Cuenta usuario) {
        this.usuario = usuario;
    }

    public int getSpent() {
        return spent;
    }

    public void setSpent(int spent) {
        this.spent = spent;
    }

    @Override
    public void comprar(int precio, iMoneda tipoMoneda) {
        SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
        spent=precio;
            if (!(tipoMoneda instanceof Boliviano)){
                tipoMoneda.convertir(precio,this);
                System.out.println("***Convirtiendo el monto "+precio+" "+tipoMoneda.getClass().getSimpleName()+" a Bolivianos***");
            }
            if (spent<=usuario.getMontoAcumulado()) {
                usuario.comprar(spent, tipoMoneda);
            } else {
                System.out.println("No se puede realizar el cobro, excede de la capacidad de su cuenta por "+(spent-usuario.getMontoAcumulado())+" Bs.");
            }
            if (usuario.getMontoAcumulado()==0){
                System.out.println("Cuenta vaciada. Deposite monto para no deshabilitar su servicio. Gracias");
                System.exit(0);
            }
        System.out.println("Su tarjeta vence el "+format.format(vence));
    }
}
