package ejercicios2do.GitHub;

public interface iGithub {
    void attach(iDesarrollador desarrollador);
    void detach(iDesarrollador desarrollador);
    void notificar(String codigoCommit);
}
