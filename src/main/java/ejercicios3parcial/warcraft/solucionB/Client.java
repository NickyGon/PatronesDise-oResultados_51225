package ejercicios3parcial.warcraft.solucionB;

import java.util.ArrayList;
import java.util.List;

public class Client {
    //Si le damos 100 en el inicializador, este se pone a 1 (%1). De este, si le aumentamos 30%,
    //sería 31 (+el 30% del 100 establecido anteriormente)
    public static void main(String[]args){
        List<Armas> list= new ArrayList<>();
        list.add(Armas.ESCOPETA);
        Entidad personaje= new Personaje("Nicole",200,list,100,100,100,100);
        personaje= new AddShield(personaje);
        personaje= new AddPotion(personaje);
        personaje= new AddWeapon(personaje, Armas.ESPADA);

        personaje.upgradeAction();

    }
}
