package strategy.ejemplo;

import java.util.List;

public class Ataque implements iModoJuego{


    @Override
    public void play(List<Jugador> jugadorList) {
        for (Jugador jugador:jugadorList){
            if (jugador.getPosition().toLowerCase().equals("delanteros")){
                System.out.println("***Delanteros atacan***");
                jugador.info();
            }
        }
    }
}
