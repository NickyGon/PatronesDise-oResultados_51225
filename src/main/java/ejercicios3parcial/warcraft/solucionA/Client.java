package ejercicios3parcial.warcraft.solucionA;

import java.util.ArrayList;
import java.util.List;

public class Client {
    //Si le damos 10000 en el inicializador, este se pone a 100 (%1). De este, si le aumentamos 30% (el 30% del 100
    //obtenido), sería 130
    public static void main(String[]args){
        List<Armas> list= new ArrayList<>();
        list.add(Armas.ESCOPETA);
        Entidad personaje= new Personaje("Nicole",200,list,10000,10000,10000,10000);
        personaje= new AddShield(personaje);
        personaje= new AddPotion(personaje);
        personaje= new AddWeapon(personaje,Armas.ESPADA);

        personaje.upgradeAction();

    }
}
