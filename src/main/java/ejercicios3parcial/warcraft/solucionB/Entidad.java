package ejercicios3parcial.warcraft.solucionB;

public interface Entidad {
    void upgradeAction();
    int getAttackPoints();
    void setAttackPoints(int attackPoints);
    int getDefensePoints();
    void setDefensePoints(int defensePoints);
    int getHealthRegenPoints();
    void setHealthRegenPoints(int healthRegenPoints);
    int getPorcentajeArmor();
    void setPorcentajeArmor(int porcentajeArmor);

    int getAttackPointsA();

    int getDefensePointsA();

    int getHealthRegenPointsA();

    int getPorcentajeArmorA();


    int getNivel();
    void setNivel(int nivel);

    void addArma(Armas armas);
}
