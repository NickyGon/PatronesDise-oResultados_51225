package command.ejercicio;

public class Juego {
    private Jugador jugador;
    private Enemigo enemigo;

    

    //Para los comandos
    private boolean escudoActivado;
    private int gunHitTimes;

    public Juego(Jugador jugador,Enemigo enemigo) {
        this.jugador=jugador;
        this.enemigo=enemigo;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    public boolean isEscudoActivado() {
        return escudoActivado;
    }

    public void setEscudoActivado(boolean escudoActivado) {
        this.escudoActivado = escudoActivado;
    }

    public int getGunHitTimes() {
        return gunHitTimes;
    }

    public void setGunHitTimes(int gunHitTimes) {
        this.gunHitTimes = gunHitTimes;
    }



    public int damagePointsDealt(String type){
        int deal=0;
        if (type.equals("melee")){
            deal=this.jugador.getMeleeDamageStrength();
        } else if (type.equals("range")){
            deal=this.jugador.getRangeDamageStrength();
        }
        int total=(this.jugador.getLevel()*deal*((int)(0.5*deal)-(int)(0.25*enemigo.getDefensePoints())))/enemigo.getDefensePoints();
        return total;
    }


    public void atacar(){
        System.out.println(jugador.getNombreJugador()+" used its "+jugador.getMeleeweapon()+" on the enemy!");
        enemigo.setHP(enemigo.getHP()-damagePointsDealt("melee"));
        System.out.println (damagePointsDealt("melee")+" damage points dealt!");
        this.showPlayerStats();
        this.showEnemyStats();
        this.check();
    }

    public void defenderse(){
        int damageReceived=enemigo.getPower()-jugador.getDefensePoints();
        jugador.setHP(jugador.getHP()-damageReceived);
        System.out.println(jugador.getNombreJugador()+" embraced itself!");
        System.out.println(jugador.getNombreJugador()+" received "+damageReceived+" points of damage!");
        this.showPlayerStats();
        this.showEnemyStats();
        this.check();
    }

    public void disparar(){
        this.gunHitTimes=2+(int)(Math.random()*((7-2)+1));
        System.out.println(jugador.getNombreJugador()+" used its "+jugador.getRangeweapon()+" on the enemy!");
        System.out.println("It hit "+this.gunHitTimes+" times!");
        enemigo.setHP(enemigo.getHP()-damagePointsDealt("range")*this.gunHitTimes);
        System.out.println (damagePointsDealt("range")*this.gunHitTimes+" damage points dealt!");
        this.showPlayerStats();
        this.showEnemyStats();
        this.check();
    }

    public void check(){
        if (jugador.getHP()<=0){
            System.out.println("GAME OVER");
            System.exit(0);
        } else if (enemigo.getHP()<=0){
            System.out.println("VICTORY");
            System.exit(0);
        }
    }


    public void showPlayerStats() {
        System.out.println("----------------------------------------------");
        System.out.println(jugador.getNombreJugador()+" | Lvl "+jugador.getLevel());
        System.out.println("HP: "+jugador.getHP()+"| Defense: "+jugador.getDefensePoints());
        System.out.println("Melee weapon: "+jugador.getMeleeweapon()+ "(Attack: "+jugador.getMeleeDamageStrength()+")");
        System.out.println("Shooting weapon: "+jugador.getRangeweapon()+ "(Attack: "+jugador.getRangeDamageStrength()+")");
        System.out.println("Shield enabled: "+escudoActivado);
        System.out.println("--");
    }
    public void showEnemyStats() {
        System.out.println("--");
        System.out.println(enemigo.getNombreEnemigo()+" | Lvl "+enemigo.getLevel());
        System.out.println("HP: "+enemigo.getHP()+"| Defense: "+enemigo.getDefensePoints());
        System.out.println("Attack points: "+enemigo.getPower());
        System.out.println("----------------------------------------------");
    }
}
