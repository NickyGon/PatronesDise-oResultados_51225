package chainOfResponsibility.ejercicio.carnets;

public interface iPersonalResposable {
    void setNext(iPersonalResposable personal); //saber el siguiente responsable
    iPersonalResposable goNext(); //Ir al siguiente responsable
    void realizarCarnetizacion(PersonaRequisitos persona); //Resuelve el problema o moverse al siguiente responsable
}
