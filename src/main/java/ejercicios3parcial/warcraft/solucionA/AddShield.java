package ejercicios3parcial.warcraft.solucionA;

public class AddShield extends Habilidades {

    public AddShield(Entidad entidad) {
        super(entidad);
    }


    @Override
    public void upgradeAction(){
        System.out.println("New Shield added!");
        System.out.println("Defense and Armor points up!");
        super.setPorcentajeArmor(((100+10)*super.getPorcentajeArmor())/100);
        super.setDefensePoints(((100+35)*super.getDefensePoints())/100);
        super.upgradeAction();
    }
}
