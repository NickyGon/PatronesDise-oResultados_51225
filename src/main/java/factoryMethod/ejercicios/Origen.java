package factoryMethod.ejercicios;

public class Origen {
    private String pais;
    private String ciudad;
    private String aeroupuerto;

    public Origen(){

    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAeroupuerto() {
        return aeroupuerto;
    }

    public void setAeroupuerto(String aeroupuerto) {
        this.aeroupuerto = aeroupuerto;
    }

    public void showInfo(){
        System.out.println("Orígen: "+pais+", "+ciudad+". "+aeroupuerto);
    }
}
