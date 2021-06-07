package chainOfResponsibility.ejercicio.ordenamientoPersonas;

public interface iOrdenamiento {
    void setNext(iOrdenamiento handler); //saber el siguiente responsable
    iOrdenamiento goNext(); //Ir al siguiente responsable
    void realizarOrdenamiento(Persona[] lista); //Resuelve el problema o moverse al siguiente responsable
}
