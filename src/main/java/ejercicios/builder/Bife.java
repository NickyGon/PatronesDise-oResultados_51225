package ejercicios.builder;

public class Bife extends Builder{

    @Override
    public void buildTipoCarne() {
        parrillas.setTipoDeCarne("Bife");
    }

    @Override
    public void buildSaborRefresco() {
        parrillas.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        parrillas.setGuarniciones("Papas Fritas");
    }
}
