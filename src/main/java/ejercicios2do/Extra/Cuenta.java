package ejercicios2do.Extra;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cuenta {
    private String id;
    private Persona persona;
    private int prestamoApagar;
    private Date plazoPrestamo;

    public Cuenta(String id, Persona persona, int prestamoApagar, Date plazoPrestamo) {
        this.id = id;
        this.persona = persona;
        this.prestamoApagar = prestamoApagar;
        this.plazoPrestamo = plazoPrestamo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getPrestamoApagar() {
        return prestamoApagar;
    }

    public void setPrestamoApagar(int prestamoApagar) {
        this.prestamoApagar = prestamoApagar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPlazoPrestamo() {
        return plazoPrestamo;
    }

    public void setPlazoPrestamo(Date plazoPrestamo) {
        this.plazoPrestamo = plazoPrestamo;
    }

    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    public void showCuenta(){
        System.out.println("Cuenta N° "+id);
        persona.showInfo();
        System.out.println("Prestamo pedido: "+prestamoApagar+"Bs. Plazo hasta: "+formato.format(plazoPrestamo));
    }
}
