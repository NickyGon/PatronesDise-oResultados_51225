package builder.ejercicios;

public class Restaurante {
    private Builder builder;

    public Pizza getPizza(){return builder.getPizza();}

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void buildPizza(){
        this.builder.createPizza();
        this.builder.buildSalsa();
        this.builder.buildIngredients();
        this.builder.buildtipoMasa();
        this.builder.buildtipoQueso();
    }
}
