package ejercicios.builder;



public class Client {

    public static void main(String[]args){


        Restaurante res=new Restaurante();

        Lomito lom=new Lomito();
        Bife bif= new Bife();
        Tira tir=new Tira();


        res.setBuilder(lom);
        res.buildParrilla();
        Parrillas p1=res.getParillas();
        System.out.println("----"+lom.getClass().getSimpleName()+"----");
        p1.showData();

        res.setBuilder(bif);
        res.buildParrilla();
        Parrillas p2=res.getParillas();
        System.out.println("----"+bif.getClass().getSimpleName()+"----");
        p2.showData();


        res.setBuilder(tir);
        res.buildParrilla();
        Parrillas p3=res.getParillas();
        System.out.println("----"+tir.getClass().getSimpleName()+"----");
        p3.showData();

    }
}
