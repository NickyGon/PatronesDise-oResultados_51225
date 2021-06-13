package strategy.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol {
    public iModoJuego modoJuego;
    private List<Jugador> jugadorList=new ArrayList<>();
    private String entrenador;

    public EquipoFutbol(){}

    public iModoJuego getModoJuego() {
        return modoJuego;
    }

    public void setModoJuego(iModoJuego modoJuego) {
        this.modoJuego = modoJuego;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public void jugar(){
        this.modoJuego.play(jugadorList);
    }
}
