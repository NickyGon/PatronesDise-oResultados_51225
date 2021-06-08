package command.ejercicio;


public class Atacar implements iComandosJuego {

    private Juego juego;

    public Atacar(Juego juego){this.juego=juego;}

    @Override
    public void execute() {
        System.out.println("**MELEE ATTACK**");
        this.juego.setEscudoActivado(false);
        this.juego.atacar();
    }
}
