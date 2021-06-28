package decorator.ejercicio;

public class BancoCliente implements Banco {

    private int monto;
    private String idCuenta;

    public BancoCliente() {
    }

    public BancoCliente(int monto, String idCuenta) {
        this.monto = monto;
        this.idCuenta = idCuenta;
    }

    public int getMonto() {
        return monto;
    }


    @Override
    public void setMonto(int monto) {
        this.monto = monto;
    }


    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Override
    public void realizarOperacion() {
        System.out.println("Realizando operación en cuenta: "+idCuenta);
        System.out.println("Monto total: "+monto+" Bs.");
    }


}
