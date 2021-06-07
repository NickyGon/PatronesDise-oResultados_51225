package chainOfResponsibility.basic;

public interface iHandler {
    void setNext(iHandler handler); //saber el siguiente responsable
    iHandler goNext(); //Ir al siguiente responsable
    void criteriaHandler(int criterioDeSolucion); //Resuelve el problema o moverse al siguiente responsable
}
