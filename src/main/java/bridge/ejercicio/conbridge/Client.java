package bridge.ejercicio.conbridge;

public class Client {
    public static void main(String[]args){
        Windows windows= new Windows(new Arquitecturax64());
        windows.ejecutar();

        Windows windows2= new Windows(new Arquitecturax86());
        windows2.ejecutar();

        Linux linux= new Linux(new Arquitecturax86());
        linux.ejecutar();
    }
}
