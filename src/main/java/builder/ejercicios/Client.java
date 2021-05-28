package builder.ejercicios;

public class Client  {

    public static void main(String[]args){
        Restaurante res=new Restaurante();

        PizzaCarnivora pc=new PizzaCarnivora();
        PizzaClasica pcl=new PizzaClasica();
        PizzaHawaiiana ph=new PizzaHawaiiana();

        res.setBuilder(pc);
        res.buildPizza();

        Pizza p1=res.getPizza();
        System.out.println("----"+pc.getClass().getSimpleName()+"----");
        p1.showData();

        res.setBuilder(pcl);
        res.buildPizza();
        Pizza p2=res.getPizza();
        System.out.println("----"+pcl.getClass().getSimpleName()+"----");
        p2.showData();

        res.setBuilder(ph);
        res.buildPizza();
        Pizza p3=res.getPizza();
        System.out.println("----"+ph.getClass().getSimpleName()+"----");
        p3.showData();

    }
}
