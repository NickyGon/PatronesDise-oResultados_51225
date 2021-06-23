package bridge.ejercicio.sinbridge;

public class Client {
    public static void main(String[]args){
        Linuxx64 linuxx64= new Linuxx64();
        linuxx64.reproductor();

        System.out.println("---------------");
        Windowsx64 windowsx64= new Windowsx64();
        System.out.println("---------------*");
        windowsx64.reproductor();
        System.out.println("---------------");
        windowsx64.paint();

        Windowsx86 windowsx86= new Windowsx86();
        System.out.println("---------------*");
        windowsx86.reproductor();
        System.out.println("---------------*");
        windowsx86.paint();
    }
}
