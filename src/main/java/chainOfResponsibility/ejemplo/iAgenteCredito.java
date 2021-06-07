package chainOfResponsibility.ejemplo;

public interface iAgenteCredito {
    void setNext(iAgenteCredito handler); //saber el siguiente responsable
    iAgenteCredito goNext(); //Ir al siguiente responsable
    void realizarPrestamo(Persona persona); //Resuelve el problema o moverse al siguiente responsable
}
