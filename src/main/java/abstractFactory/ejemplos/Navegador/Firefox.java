package abstractFactory.ejemplos.Navegador;

public class Firefox extends Browser{

    @Override
    public void openUrl(String url) {
        System.out.println("Firefox>Abriendo la url:"+url);
    }

    @Override
    public void saveCache() {
        System.out.println("Firefox>Guardando cache en Firefox");
    }
}
