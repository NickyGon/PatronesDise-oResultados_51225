package ejercicios3parcial.warcraft.solucionD;

import java.util.ArrayList;
import java.util.List;

public class Client {
    //Todos los stats inician en 1, y de ese 1% sacamos el 35% y le aumentamos (1+(35% de 1)--->1.35 (1))
    public static void main(String[]args){
        List<Armas> list= new ArrayList<>();
        list.add(Armas.ESCOPETA);
        Entidad personaje= new Personaje("Nicole");
        personaje= new AddShield(personaje);
        personaje= new AddPotion(personaje);
        personaje= new AddWeapon(personaje, Armas.ESPADA);

        personaje.upgradeAction();

    }
}
