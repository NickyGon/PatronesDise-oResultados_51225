package builder.ejemplos;

public class Client {
    public static void main(String[]args){
        Director director= new Director();

        I9Alto i1=new I9Alto();
        I7Mediano i2= new I7Mediano();
        I5Pequeno i3=new I5Pequeno();

        director.setBuilder(i1);
        director.buildComputadora();
        Computadora c1=director.getComputadora();
        c1.showData();

        director.setBuilder(i2);
        director.buildComputadora();
        Computadora c2=director.getComputadora();
        c2.showData();

        director.setBuilder(i3);
        director.buildComputadora();
        Computadora c3=director.getComputadora();
        c3.showData();



    }



}
