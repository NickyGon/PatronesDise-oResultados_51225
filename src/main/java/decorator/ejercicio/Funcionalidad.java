package decorator.ejercicio;

public class Funcionalidad implements Banco{
    private Banco banco;

    public Funcionalidad(Banco banco) {
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }


    @Override
    public void realizarOperacion() {
        this.banco.realizarOperacion();
    }

    @Override
    public int getMonto() {
        return banco.getMonto();
    }

    @Override
    public void setMonto(int monto) {
        banco.setMonto(monto);
    }
}
