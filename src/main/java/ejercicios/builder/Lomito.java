package ejercicios.builder;

public class Lomito extends Builder{

    @Override
    public void buildTipoCarne() {
        parrillas.setTipoDeCarne("Lomo");
    }

    @Override
    public void buildSaborRefresco() {
        parrillas.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        parrillas.setGuarniciones("Arroz");
    }
}
