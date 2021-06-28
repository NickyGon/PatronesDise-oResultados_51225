package ejercicios3parcial.empresaApps;

public class AppIOSB implements iAppsPC{
    private AppIOS appIOS;

    public AppIOSB(AppIOS appIOS) {
        this.appIOS = appIOS;
    }

    @Override
    public void iniciarSesion() {
        set();
        System.out.println("Adaptando la estructura de inicio de sesión en la app de IOS");
        appIOS.logIn();
        restore();
    }

    @Override
    public void cerrarSesion() {
        set();
        System.out.println("Adaptando la estructura de cierre de sesión en la app de IOS");
        appIOS.logOut();
        restore();
    }

    @Override
    public void generarDatos() {
        set();
        System.out.println("Adaptando la estructura de reportes en la app de IOS");
        appIOS.reportes();
        restore();

    }

    public void set(){
        appIOS.setDetailintro("Iniciando sesión");
        appIOS.setTipoPrograma("Programa");
    }

    public void restore(){
        appIOS.setDetailintro("Conectando");
        appIOS.setTipoPrograma("aplicación");
    }
}
