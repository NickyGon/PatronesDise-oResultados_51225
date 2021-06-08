package command.ejercicio;


public class Defenderse implements iComandosJuego {

    private Juego juego;

    public Defenderse(Juego juego){this.juego=juego;}

    @Override
    public void execute() {
        System.out.println("**SHIELD**");
        this.juego.setEscudoActivado(true);
        this.juego.defenderse();
    }
}
