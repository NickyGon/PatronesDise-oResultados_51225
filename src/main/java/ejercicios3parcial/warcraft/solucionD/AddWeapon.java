package ejercicios3parcial.warcraft.solucionD;

public class AddWeapon extends Habilidades {

    public AddWeapon(Entidad entidad, Armas armas) {
        super(entidad,armas);
    }
    @Override
    public void upgradeAction(){
        System.out.println("New Weapon added!");
        System.out.println("Attack and level points up!");
        super.setAttackPoints((int) Math.round(super.getAttackPoints()*1.30));
        super.setNivel(super.getNivel()*2);
        super.upgradeAction();

    }
}
