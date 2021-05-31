package ejercicios.builder;

public class Tira extends Builder{

    @Override
    public void buildTipoCarne() {
        parrillas.setTipoDeCarne("Tira de Carne");
    }

    @Override
    public void buildSaborRefresco() {
        parrillas.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        parrillas.setGuarniciones("Fideo");
    }
}
