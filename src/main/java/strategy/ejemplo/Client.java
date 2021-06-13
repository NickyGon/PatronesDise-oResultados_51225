package strategy.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[]args){
        EquipoFutbol equipoFutbol=new EquipoFutbol();
        equipoFutbol.setEntrenador("Marihuela");
        List<Jugador> listJugador=new ArrayList<>();
        listJugador.add(new Jugador("1113456","Nicole",3,"arquero"));
        listJugador.add(new Jugador("1113457","Nero",4,"defensa"));
        listJugador.add(new Jugador("1113458","Nani",5,"defensa"));
        listJugador.add(new Jugador("1113459","Nulo",6,"defensa"));
        listJugador.add(new Jugador("1113460","Nora",7,"medio campista"));
        listJugador.add(new Jugador("1113461","Nino",8,"medio campista"));
        listJugador.add(new Jugador("1113462","Nilo",9,"medio campista"));
        listJugador.add(new Jugador("1113463","Necio",10,"delanteros"));
        listJugador.add(new Jugador("1113464","Nelson",11,"delanteros"));
        listJugador.add(new Jugador("1113465","Nelco",12,"delanteros"));

        equipoFutbol.setJugadorList(listJugador);

        //local
        equipoFutbol.setModoJuego(new Defensa());
        equipoFutbol.jugar();

        equipoFutbol.setModoJuego(new ContraGolpe());
        equipoFutbol.jugar();

    }
}
