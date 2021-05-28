package builder.ejercicios;

public abstract class Builder {
    protected Pizza pizza;
    public Pizza getPizza(){return pizza;}
    public void createPizza(){
        pizza=new Pizza();
    }

    public abstract void buildSalsa();
    public abstract void buildIngredients();
    public abstract void buildtipoQueso();
    public abstract void buildtipoMasa();

}
