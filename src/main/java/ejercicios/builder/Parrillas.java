package ejercicios.builder;

public class Parrillas {
    private String tipoDeCarne;
    private String saborRefresco;
    private String guarniciones;
    public Parrillas(){}

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public void setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
    }

    public void showData(){
        System.out.println("Tipo de Carne: "+tipoDeCarne);
        System.out.println("Sabor de Refresco: "+saborRefresco);
        System.out.println("Guarniciones: "+guarniciones);
    }
}
