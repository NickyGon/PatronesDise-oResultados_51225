package ejercicios3parcial.empresaApps;

public class AppAndroidB implements iAppsPC{
    private AppAndroid appAndroid;

    public AppAndroidB(AppAndroid appAndroid) {
        this.appAndroid = appAndroid;
    }

    @Override
    public void iniciarSesion() {
        set();
        System.out.println("Adaptando la estructura de inicio de sesión en la app de Android");
        appAndroid.logIn();
        restore();
    }

    @Override
    public void cerrarSesion() {
        set();
        System.out.println("Adaptando la estructura de cierre de sesión en la app de Android");
        appAndroid.logOut();
        restore();
    }

    @Override
    public void generarDatos() {
        set();
        System.out.println("Adaptando la estructura de reportes en la app de Android");
        appAndroid.reportes();
        restore();

    }

    public void set(){
        appAndroid.setDetailintro("Iniciando sesión");
        appAndroid.setTipoPrograma("Programa");
    }

    public void restore(){
        appAndroid.setDetailintro("Conectando");
        appAndroid.setTipoPrograma("aplicación");
    }
}
