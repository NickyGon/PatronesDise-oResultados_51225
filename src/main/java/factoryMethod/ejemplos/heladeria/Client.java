package factoryMethod.ejemplos.heladeria;

public class Client {
    public static void main(String[]args){
        CreatorHelados heladoAgua=new CreadorHeladoAgua();
        heladoAgua.create().crear();
        System.out.println();
        CreatorHelados heladoCrema=new CreadorHeladoCrema();
        heladoCrema.create().crear();
        System.out.println();
        CreatorHelados heladoMixto=new CreadorHeladoMixto();
        HeladoMixto helado= (HeladoMixto) heladoMixto.create(); // modificador
        helado.setTamano("Gigante Plus Ultra"); // modificador
        helado.crear();
        System.out.println();
        CreatorHelados heladoMixto2=new CreadorHeladoMixto();
        HeladoMixto helado1= (HeladoMixto) heladoMixto2.create(); // modificador
        helado1.setTamano("Nopo");
        helado1.crear();
    }
}
