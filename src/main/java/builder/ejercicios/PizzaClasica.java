package builder.ejercicios;

public class PizzaClasica extends Builder{
    @Override
    public void buildSalsa() {
        pizza.setSalsa("Salsa Barbacoa");
    }

    @Override
    public void buildIngredients() {
        String[] ingredientList={"Jamón"};
        pizza.setIngredientes(ingredientList);
    }


    @Override
    public void buildtipoQueso() {
        pizza.setTipoQueso("Doble Mozzarella");
    }

    @Override
    public void buildtipoMasa() {
        pizza.setTipoMasa("Normal");
    }
}
