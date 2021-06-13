package strategy.ejemplo;

import java.util.List;
import java.util.Locale;

public class Defensa implements iModoJuego{

    @Override
    public void play(List<Jugador> jugadorList) {
        for (Jugador jugador:jugadorList){
            if (jugador.getPosition().toLowerCase().equals("defensa")){
                System.out.println("***Jugadores replegandose antes del medio campo***");
                jugador.info();
            }
        }
    }
}
