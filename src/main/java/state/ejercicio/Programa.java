package state.ejercicio;

public class Programa {
    private String nombre;
    private boolean enabled;

    public Programa(String nombre, boolean enabled) {
        this.nombre = nombre;
        this.enabled = enabled;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
