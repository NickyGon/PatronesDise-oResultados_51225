package decorator.ejemplo;

public class Client {
    public static void main(String[]args){
        IDE eclipse= new Eclipse();
        ((Eclipse)eclipse).setLicencia("OpenSource");
        ((Eclipse)eclipse).setPrecio(3);
        ((Eclipse)eclipse).setTamano("50mb");
        ((Eclipse)eclipse).setVersion("v2020");

        eclipse= new PluginTest(eclipse,50,false);
        eclipse= new PluginDeploy(eclipse,0,true);

        eclipse.execute();
    }
}
