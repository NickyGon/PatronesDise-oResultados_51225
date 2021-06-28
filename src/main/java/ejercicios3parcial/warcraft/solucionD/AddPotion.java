package ejercicios3parcial.warcraft.solucionD;

public class AddPotion extends Habilidades {

    public AddPotion(Entidad entidad) {
        super(entidad);
    }
    @Override
    public void upgradeAction(){
        System.out.print("New Potion added! ");
        System.out.println("Health Regeneration points up!");
        super.setHealthRegenPoints((int) Math.round(super.getHealthRegenPoints()*1.80));
        super.upgradeAction();
    }
}
