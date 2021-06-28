package ejercicios3parcial.warcraft.solucionB;

public class Habilidades implements Entidad {
    private Entidad personaje;


    public Habilidades(Entidad personaje, Armas armas) {
        this.personaje = personaje;
        addArma(armas);
    }

    public Habilidades(Entidad personaje){
        this.personaje = personaje;
    }

    public Entidad getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Entidad personaje) {
        this.personaje = personaje;
    }

    @Override
    public void upgradeAction() {
        this.personaje.upgradeAction();
    }

    @Override
    public int getAttackPoints() {
        return this.personaje.getAttackPoints();
    }

    @Override
    public void setAttackPoints(int attackPoints) {
        personaje.setAttackPoints(attackPoints);
    }

    @Override
    public int getDefensePoints() {
        return this.personaje.getDefensePoints();
    }

    @Override
    public void setDefensePoints(int defensePoints) {
        personaje.setDefensePoints(defensePoints);
    }

    @Override
    public int getHealthRegenPoints() {
        return this.personaje.getHealthRegenPoints();
    }

    @Override
    public void setHealthRegenPoints(int healthRegenPoints) {
        personaje.setHealthRegenPoints(healthRegenPoints);
    }

    @Override
    public int getPorcentajeArmor() {
        return this.personaje.getPorcentajeArmor();
    }

    @Override
    public void setPorcentajeArmor(int porcentajeArmor) {
        personaje.setPorcentajeArmor(porcentajeArmor);
    }

    @Override
    public int getAttackPointsA() {
        return this.personaje.getAttackPointsA();
    }

    @Override
    public int getDefensePointsA() {
        return this.personaje.getDefensePointsA();
    }

    @Override
    public int getHealthRegenPointsA() {
        return this.personaje.getHealthRegenPointsA();
    }

    @Override
    public int getPorcentajeArmorA() {
        return this.personaje.getPorcentajeArmorA();
    }

    @Override
    public int getNivel() {
        return this.personaje.getNivel();
    }

    @Override
    public void setNivel(int nivel) {
        personaje.setNivel(nivel);
    }

    @Override
    public void addArma(Armas armas) {
        this.personaje.addArma(armas);
    }




}
