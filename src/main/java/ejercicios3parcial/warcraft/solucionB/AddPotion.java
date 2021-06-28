package ejercicios3parcial.warcraft.solucionB;

public class AddPotion extends Habilidades {

    public AddPotion(Entidad entidad) {
        super(entidad);
    }
    @Override
    public void upgradeAction(){
        System.out.println("New Potion added!");
        System.out.println("Health Regeneration points up!");
        int percen=((100-20)*super.getHealthRegenPointsA())/100;
        super.setHealthRegenPoints(super.getHealthRegenPoints()+percen);
        super.upgradeAction();
    }
}
