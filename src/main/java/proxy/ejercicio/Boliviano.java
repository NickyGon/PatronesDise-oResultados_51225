package proxy.ejercicio;

public class Boliviano implements iMoneda{
    @Override
    public void convertir(int precio, TarjetaCredito tarjetaCredito) {
        tarjetaCredito.setSpent(precio);
    }
}
