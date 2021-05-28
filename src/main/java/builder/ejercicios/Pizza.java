package builder.ejercicios;

public class Pizza {
    private String[] ingredientes;
    private String tipoQueso;
    private String tipoMasa;
    private String salsa;

    public Pizza(){}

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void showData(){
        System.out.println("Ingredientes: ");
        for (String s: ingredientes) {
            System.out.println(s);
        }
        System.out.println("Tipo de queso: "+tipoQueso);
        System.out.println("Tipo de masa: "+tipoMasa);
        System.out.println("Tipo de salsa: "+salsa);
    }
}
