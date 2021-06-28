package ejercicios3parcial.warcraft.solucionC;

public class AddWeapon extends Habilidades {

    public AddWeapon(Entidad entidad, Armas armas) {
        super(entidad,armas);
    }
    @Override
    public void upgradeAction(){
        System.out.println("New Weapon added!");
        System.out.println("Attack and level points up!");
        int percen=((100-70)*100)/100;
        super.setAttackPoints(super.getAttackPoints()+percen);
        super.setNivel(super.getNivel()*2);
        super.upgradeAction();

    }
}
