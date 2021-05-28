package abstractFactory.ejemplos.Navegador;

public class FactoryNavegador {
    public static final String CHROME="chrome";
    public static final String FIREFOX="firefox";
    public static final String EDGE="edge";
    public static final String SAFARI="safari";
    public static Browser make(String type){
        Browser b1;
        switch (type){
            case CHROME:
                b1=new Chrome();
                break;
            case FIREFOX:
                b1=new Firefox();
                break;
            case EDGE:
                b1=new Edge();
                break;
            case SAFARI:
                b1=new Safari();
                break;
            default:
                b1=new Chrome();
                break;
        }
        return b1;
    }
}
