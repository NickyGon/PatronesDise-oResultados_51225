package command.ejercicio;


public class Client {
    public static void main(String[]args){
        Juego juego=new Juego(new Jugador("Nicole",200,50,22),new Enemigo("Orc",10000,20,10,90));
        juego.getJugador().setMeleeDamageStrength(Jugador.ArmaMelee.BASEBALLBAT);
        juego.getJugador().setRangeDamageStrength(Jugador.ArmaTiro.BAZOOKA);


        Atacar atacar=new Atacar(juego);
        Defenderse defenderse=new Defenderse(juego);
        Disparar disparar=new Disparar(juego);
        Defenderse defenderse1=new Defenderse(juego);

        LaunchMoveset launchMoveset=new LaunchMoveset();
        launchMoveset.ingresaComando(atacar);
        launchMoveset.ingresaComando(defenderse);
        launchMoveset.ingresaComando(disparar);
        launchMoveset.ingresaComando(defenderse1);

        launchMoveset.ejecutarElMoveset();
    }
}
