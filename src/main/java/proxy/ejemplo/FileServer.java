package proxy.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class FileServer implements iServidor{
    private String ip;
    private String port;
    private String hostname;
    private List<Archivo> storeArchivos;

    public FileServer() {

    }

    public FileServer(String ip, String port, String hostname) {
        this.ip = ip;
        this.port = port;
        this.hostname = hostname;
        storeArchivos= new ArrayList<>();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public void guardar(Archivo archivo) {
        System.out.println("Archivo Guardado");
        storeArchivos.add(archivo);
        archivo.showInfo();
    }
}
