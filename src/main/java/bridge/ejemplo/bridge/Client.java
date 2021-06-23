package bridge.ejemplo.bridge;

public class Client {
    public static void main(String[]args){
        iFigura cuadrado= new Cuadrado(new Rojo());
        cuadrado.pintar();

        iFigura circulo= new Circulo(new Amarillo());
        circulo.pintar();

        iFigura traingulo= new Triangulo(new Azul());
        traingulo.pintar();

        iFigura cuadrado2= new Cuadrado(new Morado());
        cuadrado2.pintar();

        iFigura cuadrado3= new Cuadrado(new Cafe());
        cuadrado3.pintar();

        iFigura cuadrado4= new Cuadrado(new Verde());
        cuadrado4.pintar();
    }
}
