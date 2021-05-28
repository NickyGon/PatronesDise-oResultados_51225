package abstractFactory.ejemplos.Navegador;

public class Chrome extends Browser{

    @Override
    public void openUrl(String url) {
        System.out.println("Chrome>Abriendo la url:"+url);
    }

    @Override
    public void saveCache() {
        System.out.println("Chrome>guardando cache en Firefox");
    }
}
