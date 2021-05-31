package ejercicios.FactoryMethod;

public class Computadoras {
    private String marca;
    private String OS;

    public Computadoras(){

    }

    public Computadoras(String marca, String OS) {
        this.marca = marca;
        this.OS = OS;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void showData(){
        System.out.println("Computadora. Marca: "+marca+". OS: "+OS);
    }

}
