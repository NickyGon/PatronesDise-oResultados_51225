package ejercicios3parcial.warcraft.solucionA;

public class AddWeapon extends Habilidades {

    public AddWeapon(Entidad entidad,Armas armas) {
        super(entidad,armas);
    }
    @Override
    public void upgradeAction(){
        System.out.println("New Weapon added!");
        System.out.println("Attack and level points up!");
        super.setAttackPoints(((100+30)*super.getAttackPoints())/100);
        super.setNivel(super.getNivel()*2);
        super.upgradeAction();

    }
}
