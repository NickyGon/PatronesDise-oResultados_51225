package ejercicios3parcial.servidores;

public interface iClusterServer {
    void registrar(Usuario usuario);
    void login(String user, String password);
}
