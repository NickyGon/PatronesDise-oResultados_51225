package strategy.ejemplo;

import java.util.List;

public class TiroLibre implements iModoJuego{

    @Override
    public void play(List<Jugador> jugadorList) {
        for (Jugador jugador:jugadorList){
            if (jugador.getPosition().toLowerCase().equals("delanteros")){
                System.out.println("***Jugador ejecuta el tiro libre***");
                jugador.info();
                break;
            }

        }
    }
}
