package ejercicios3parcial.warcraft.solucionD;

public class AddShield extends Habilidades {

    public AddShield(Entidad entidad) {
        super(entidad);
    }


    @Override
    public void upgradeAction(){
        System.out.println("New Shield added!");
        System.out.println("Defense and Armor points up!");
        super.setPorcentajeArmor((int) Math.round(super.getPorcentajeArmor()*1.10));
        super.setDefensePoints((int) Math.round(super.getDefensePoints()*1.35));
        super.upgradeAction();
    }
}
