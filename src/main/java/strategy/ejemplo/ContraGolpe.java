package strategy.ejemplo;

import java.util.List;

public class ContraGolpe implements iModoJuego{

    @Override
    public void play(List<Jugador> jugadorList) {
        for (Jugador jugador:jugadorList){
            if (!jugador.getPosition().toLowerCase().equals("defensa")){
                System.out.println("***Jugadores van al frente para el contraataque***");
                jugador.info();
            }
        }

    }
}
