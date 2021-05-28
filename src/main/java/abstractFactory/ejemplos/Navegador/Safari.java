package abstractFactory.ejemplos.Navegador;

public class Safari extends Browser{

    @Override
    public void openUrl(String url) {
        System.out.println("Safari>Abriendo la url:"+url);
    }

    @Override
    public void saveCache() {
        System.out.println("Safari>guardando cache en Firefox");
    }
}
