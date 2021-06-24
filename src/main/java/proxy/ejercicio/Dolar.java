package proxy.ejercicio;

public class Dolar implements iMoneda{
    @Override
    public void convertir(int precio, TarjetaCredito tarjetaCredito) {
        tarjetaCredito.setSpent((int) (precio*6.92));
    }
}
