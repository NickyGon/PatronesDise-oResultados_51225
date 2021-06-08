package command.ejercicio;

public class Enemigo {
    private String nombreEnemigo;
    private int HP;
    private int DefensePoints;
    private int Level;
    private int power;

    public Enemigo(String nombreEnemigo, int HP, int defensePoints, int level, int power) {
        this.nombreEnemigo = nombreEnemigo;
        this.HP = HP;
        this.DefensePoints = defensePoints;
        this.Level = level;
        this.power = power;
    }

    public String getNombreEnemigo() {
        return nombreEnemigo;
    }

    public void setNombreEnemigo(String nombreEnemigo) {
        this.nombreEnemigo = nombreEnemigo;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
