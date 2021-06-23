package proxy.ejercicio;

public class PesoArg implements iMoneda{
    @Override
    public void convertir(int precio, TarjetaCredito tarjetaCredito) {
        tarjetaCredito.setSpent((int) (precio*0.072));
    }
}
