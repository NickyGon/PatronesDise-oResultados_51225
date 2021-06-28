package ejercicios3parcial.warcraft.solucionC;

import java.util.ArrayList;
import java.util.List;

public class Client {
    //No establecemos valores, todos empiezan en 1. De ahi, recien se aumenta el % de 100 (Ej. 1+35 (35%)=36%)
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
