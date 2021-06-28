package ejercicios3parcial.empresaApps;

public class Client {
    public static void main(String[]args){
        AppAndroid appAndroid= new AppAndroid("Chicken Run","Juegos","Ping");
        AppWindowsPhone appWindowsPhone= new AppWindowsPhone("Musi","Musica","Wone");
        AppEscritorio appEscritorio= new AppEscritorio("Plants vs Zombies","Juegos","PopCap");
        AppIOS appIOS= new AppIOS("Centipad","Juegos","T.P.");
        AppWeb appWeb= new AppWeb("Papa's Mega Burgueria","Juegos","Flipline Studios");

        System.out.println("**************************");
        appAndroid.logIn();
        appAndroid.logOut();
        appAndroid.reportes();
        System.out.println("**************************");
        appWindowsPhone.logIn();
        appWindowsPhone.logOut();
        appWindowsPhone.reportes();
        System.out.println("**************************");
        appIOS.logIn();
        appIOS.logOut();
        appIOS.reportes();
        System.out.println("****************************");
        appWeb.iniciarSesion();
        appWeb.cerrarSesion();
        appWeb.generarDatos();
        System.out.println("******************************");
        appEscritorio.iniciarSesion();
        appEscritorio.cerrarSesion();
        appEscritorio.generarDatos();

        AppIOSB appIOSB=new AppIOSB(appIOS);
        AppAndroidB appAndroidB= new AppAndroidB(appAndroid);
        AppWindowsPhoneB appWindowsPhoneB= new AppWindowsPhoneB(appWindowsPhone);
        System.out.println("-------------------------------");
        appIOSB.iniciarSesion();
        appIOSB.cerrarSesion();
        appIOSB.generarDatos();
        System.out.println("-------------------------------");
        appAndroidB.iniciarSesion();
        appAndroidB.cerrarSesion();
        appAndroidB.generarDatos();
        System.out.println("-------------------------------");
        appWindowsPhoneB.iniciarSesion();
        appWindowsPhoneB.cerrarSesion();
        appWindowsPhoneB.generarDatos();
    }
}
