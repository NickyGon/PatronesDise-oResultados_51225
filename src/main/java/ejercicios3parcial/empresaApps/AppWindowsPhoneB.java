package ejercicios3parcial.empresaApps;

public class AppWindowsPhoneB implements iAppsPC{
    private AppWindowsPhone appWindowsPhone;

    public AppWindowsPhoneB(AppWindowsPhone appWindowsPhone) {
        this.appWindowsPhone = appWindowsPhone;
    }

    @Override
    public void iniciarSesion() {
        set();
        System.out.println("Adaptando la estructura de inicio de sesión en la app de WindowsPhone");
        appWindowsPhone.logIn();
        restore();
    }

    @Override
    public void cerrarSesion() {
        set();
        System.out.println("Adaptando la estructura de cierre de sesión en la app de WindowsPhone");
        appWindowsPhone.logOut();
        restore();
    }

    @Override
    public void generarDatos() {
        set();
        System.out.println("Adaptando la estructura de reportes en la app de WindowsPhone");
        appWindowsPhone.reportes();
        restore();

    }

    public void set(){
        appWindowsPhone.setDetailintro("Iniciando sesión");
        appWindowsPhone.setTipoPrograma("Programa");
    }

    public void restore(){
        appWindowsPhone.setDetailintro("Conectando");
        appWindowsPhone.setTipoPrograma("aplicación");
    }
}
