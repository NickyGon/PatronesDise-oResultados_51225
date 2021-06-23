package proxy.ejemplo;


public class Proxy implements iServidor{
    private FileServer datosServer= new FileServer("10.10.10.10","8080","datosreales");
    private FileServer datosNoPermitdos = new FileServer("192.168.1.1","8080","datosNoPermitidos");
    private String ip;
    private String port;

    public Proxy(String ip, String port) {
        this.ip = ip;
        this.port = port;
        System.out.println("Inicializando proxy...");
        System.out.println("IP: "+ip);
        System.out.println("Puerto: "+port);
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

    @Override
    public void guardar(Archivo archivo) {
        if (archivo.getExtension().toLowerCase().equals("pdf")||archivo.getExtension().toLowerCase().equals("xls")||archivo.getExtension().toLowerCase().equals("doc")){
            System.out.println("Guardando archivo en Servidor: "+datosServer.getIp());
            datosServer.guardar(archivo);
        } else {
            System.out.println("---Archivo NO permitido---");
            System.out.println("Copiando a "+datosNoPermitdos.getIp());
            datosNoPermitdos.guardar(archivo);
            System.out.println("----------------------------");
        }
    }
}
