package prototype.ejercicios;

public class SIM {
    private String nombreEmpresaTel;
    private String numeroTelefono;

    public SIM(){

    }

    public SIM(String nombreEmpresaTel, String numeroTelefono) {
        this.nombreEmpresaTel = nombreEmpresaTel;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombreEmpresaTel() {
        return nombreEmpresaTel;
    }

    public void setNombreEmpresaTel(String nombreEmpresaTel) {
        this.nombreEmpresaTel = nombreEmpresaTel;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
