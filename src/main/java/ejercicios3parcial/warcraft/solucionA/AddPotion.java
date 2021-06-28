package ejercicios3parcial.warcraft.solucionA;

public class AddPotion extends Habilidades {

    public AddPotion(Entidad entidad) {
        super(entidad);
    }
    @Override
    public void upgradeAction(){
        System.out.println("New Potion added!");
        System.out.println("Health Regeneration points up!");
        super.setHealthRegenPoints(((100+80)*super.getHealthRegenPoints())/100);
        super.upgradeAction();
    }
}
