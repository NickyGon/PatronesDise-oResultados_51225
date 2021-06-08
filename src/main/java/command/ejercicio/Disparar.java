package command.ejercicio;


public class Disparar implements iComandosJuego {

    private Juego juego;

    public Disparar(Juego juego){this.juego=juego;}

    @Override
    public void execute() {
        System.out.println("**RANGE ATTACK**");
        this.juego.setEscudoActivado(false);
        this.juego.disparar();
    }
}
