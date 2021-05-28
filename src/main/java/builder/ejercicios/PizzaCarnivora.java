package builder.ejercicios;

public class PizzaCarnivora extends Builder{
    @Override
    public void buildSalsa() {
        pizza.setSalsa("Salsa de tomate");
    }

    @Override
    public void buildIngredients() {
        String[] ingredientList={"Jamón","Pepperoni","Tocino","Carne de Res","Chorizo Español"};
        pizza.setIngredientes(ingredientList);
    }

    @Override
    public void buildtipoQueso() {
        pizza.setTipoQueso("Mozzarella");
    }

    @Override
    public void buildtipoMasa() {
        pizza.setTipoMasa("Especial");
    }
}
