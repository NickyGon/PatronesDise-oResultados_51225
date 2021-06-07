package chainOfResponsibility.ejemplo;

public class Persona {
    private String ci;
    private String name;
    private int prestamoSolicitado;

    public Persona(String ci, String name, int prestamoSolicitado) {
        this.ci = ci;
        this.name = name;
        this.prestamoSolicitado = prestamoSolicitado;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrestamoSolicitado() {
        return prestamoSolicitado;
    }

    public void setPrestamoSolicitado(int prestamoSolicitado) {
        this.prestamoSolicitado = prestamoSolicitado;
    }

    public void showInfo(){
        System.out.println("Name: "+name);
        System.out.println("CI: "+ci);
        System.out.println("Prestamo pedido: "+prestamoSolicitado);
    }
}
