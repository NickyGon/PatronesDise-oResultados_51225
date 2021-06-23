package proxy.ejercicio;

public class Euro implements iMoneda{
    @Override
    public void convertir(int precio, TarjetaCredito tarjetaCredito) {
        tarjetaCredito.setSpent((int) (precio*8.23));
    }
}
