package command.ejercicio;

public class Jugador {
    private String nombreJugador;
    private int HP;
    private int DefensePoints;
    private int Level;
    private String meleeweapon;
    private String rangeweapon;
    private int meleeDamageStrength;
    private int rangeDamageStrength;

    public enum ArmaMelee{
        BASEBALLBAT,KNIFE,POLE;
    }

    public enum ArmaTiro{
        SHOTGUN,BAZOOKA,RAILGUN;
    }

    public Jugador(String nombreJugador, int HP, int defensePoints, int level) {
        this.nombreJugador = nombreJugador;
        this.HP = HP;
        DefensePoints = defensePoints;
        Level = level;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDefensePoints() {
        return DefensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        DefensePoints = defensePoints;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public String getMeleeweapon() {
        return meleeweapon;
    }

    public void setMeleeweapon(String meleeweapon) {
        this.meleeweapon = meleeweapon;
    }

    public String getRangeweapon() {
        return rangeweapon;
    }

    public void setRangeweapon(String rangeweapon) {
        this.rangeweapon = rangeweapon;
    }

    public int getMeleeDamageStrength() {
        return meleeDamageStrength;
    }

    public int getRangeDamageStrength() {
        return rangeDamageStrength;
    }

    public void setMeleeDamageStrength(ArmaMelee armaMelee) {
        switch (armaMelee){
            case BASEBALLBAT:
                this.meleeDamageStrength=40;
                meleeweapon="Baseball Bat";
                break;
            case POLE:
                this.meleeDamageStrength=25;
                meleeweapon="Metal Pole";
                break;
            case KNIFE:
                this.meleeDamageStrength=15;
                meleeweapon="Butcher's Knife";
                break;
        }
    }

    public void setRangeDamageStrength(ArmaTiro armaTiro){
        switch (armaTiro){
            case SHOTGUN:
                this.rangeDamageStrength=40;
                rangeweapon="Shotgun";
                break;
            case BAZOOKA:
                this.rangeDamageStrength=60;
                rangeweapon="Bazooka";
                break;
            case RAILGUN:
                this.rangeDamageStrength=55;
                rangeweapon="Railgun";
                break;
        }
    }


}
