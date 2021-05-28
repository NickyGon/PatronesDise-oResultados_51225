package builder.ejercicios;

public class PizzaHawaiiana extends Builder{
    @Override
    public void buildSalsa() {
        pizza.setSalsa("Salsa de tomate");
    }

    @Override
    public void buildIngredients() {
        String[] ingredientList={"Jamón","Cherry","Piña"};
        pizza.setIngredientes(ingredientList);
    }

    @Override
    public void buildtipoQueso() {
        pizza.setTipoQueso("Cheddar");
    }

    @Override
    public void buildtipoMasa() {
        pizza.setTipoMasa("Normal");
    }
}
