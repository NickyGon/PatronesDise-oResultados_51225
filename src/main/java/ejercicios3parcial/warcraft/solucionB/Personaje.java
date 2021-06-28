package ejercicios3parcial.warcraft.solucionB;

import java.util.ArrayList;
import java.util.List;

public class Personaje implements Entidad {
    private String userName;
    private int nivel;
    private List<Armas> armaList=new ArrayList<>();
    private int porcentajeArmorA;
    private int attackPointsA;
    private int healthRegenPointsA;
    private int defensePointsA;

    private int porcentajeArmor;
    private int attackPoints;
    private int defensePoints;
    private int healthRegenPoints;


    public Personaje(String userName, int nivel, List<Armas> armaList, int porcentajeArmor, int attackPoints, int defensePoints, int healthRegenPoints) {
        this.userName = userName;
        this.nivel = nivel;
        this.armaList = armaList;
        this.porcentajeArmorA=porcentajeArmor;
        this.attackPointsA=attackPoints;
        this.healthRegenPointsA=healthRegenPoints;
        this.defensePointsA=defensePoints;
        this.porcentajeArmor = (int) (porcentajeArmor*0.01);
        this.attackPoints = (int) (attackPoints*0.01);
        this.defensePoints = (int) (defensePoints*0.01);
        this.healthRegenPoints = (int) (healthRegenPoints*0.01);
        System.out.println("Inicializando al personaje");
        info();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<Armas> getArmaList() {
        return armaList;
    }

    public void setArmaList(List<Armas> armaList) {
        this.armaList = armaList;
    }

    public int getPorcentajeArmor() {
        return porcentajeArmor;
    }

    public void setPorcentajeArmor(int porcentajeArmor) {
        this.porcentajeArmor = porcentajeArmor;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public int getHealthRegenPoints() {
        return healthRegenPoints;
    }

    public void setHealthRegenPoints(int healthRegenPoints) {
        this.healthRegenPoints = healthRegenPoints;
    }



    public int getPorcentajeArmorA() {
        return porcentajeArmorA;
    }


    public int getAttackPointsA() {
        return attackPointsA;
    }


    public int getHealthRegenPointsA() {
        return healthRegenPointsA;
    }


    public int getDefensePointsA() {
        return defensePointsA;
    }



    @Override
    public void upgradeAction() {
        System.out.println("Character's stats upgraded!");
        info();
    }

    public void info(){
        System.out.println("---------------------------------");
        System.out.println(userName+" Lvl. "+nivel);
        System.out.println("Armor: "+porcentajeArmor+"%");
        System.out.println("Attack Points: "+attackPoints);
        System.out.println("Defense Points: "+defensePoints);
        System.out.println("Health Regeneration Points: "+healthRegenPoints);
        System.out.println("Weapons: ");
        for (Armas armas: armaList){
            System.out.println("-"+armas.name()+" ("+armas.getName()+")");
        }
        System.out.println("---------------------------------");
    }

    public void addArma(Armas armas){
        this.armaList.add(armas);
    }
}
