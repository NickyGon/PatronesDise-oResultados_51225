package chainOfResponsibility.ejercicio.servicioSoftware;

public interface iTeamScrum {
    void setNext(iTeamScrum handler); //saber el siguiente responsable
    iTeamScrum goNext(); //Ir al siguiente responsable
    void realizarSolicitud(Solicitud solicitud); //Resuelve el problema o moverse al siguiente responsable
}
