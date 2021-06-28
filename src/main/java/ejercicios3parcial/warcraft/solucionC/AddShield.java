package ejercicios3parcial.warcraft.solucionC;

public class AddShield extends Habilidades {

    public AddShield(Entidad entidad) {
        super(entidad);
    }

    @Override
    public void upgradeAction(){
        System.out.println("New Shield added!");
        System.out.println("Defense and Armor points up!");
        int percen=((100-90)*100)/100;
        int percen2=((100-65)*100)/100;
        super.setPorcentajeArmor(super.getPorcentajeArmor()+percen);
        super.setDefensePoints(super.getDefensePoints()+percen2);
        super.upgradeAction();
    }
}
