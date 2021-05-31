package ejercicios.builder;

public class Restaurante {
    private Builder builder;
    public Parrillas getParillas(){return builder.getParrillas();}
    public void setBuilder(Builder builder){this.builder=builder;}
    public void buildParrilla(){
        this.builder.createParrilla();
        this.builder.buildTipoCarne();
        this.builder.buildSaborRefresco();
        this.builder.buildGuarniciones();
    }

}
