package abstractFactory.ejemplos.Navegador;

public class Edge extends Browser{

    @Override
    public void openUrl(String url) {
        System.out.println("Edge>Abriendo la url:"+url);
    }

    @Override
    public void saveCache() {
        System.out.println("Edge>guardando cache en Firefox");
    }
}
