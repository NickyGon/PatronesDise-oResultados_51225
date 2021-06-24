package composite.ejercicio;

public class Client {
    public static void main(String[]args){
        Computadora computadora1= new Computadora("Asus","VivoBook");
        Computadora computadora2= new Computadora("Asus","ZenBook");
        Computadora computadora3= new Computadora("Asus","ChromeBook");


        Computadora computadora4= new Computadora("Samsung","Notebook Oddysey 11");
        Computadora computadora5= new Computadora("Samsung","Notebook Oddysey 21");
        Computadora computadora6= new Computadora("Samsung","Notebook Oddysey 31");


        Computadora computadora7= new Computadora("HP","Spectre");
        Computadora computadora8= new Computadora("HP","ENVY");
        Computadora computadora9= new Computadora("HP","Pavillion");


        CompositeComputadora laboratorio= new CompositeComputadora("AsusLab");
        laboratorio.add(computadora1);
        laboratorio.add(computadora2);
        laboratorio.add(computadora3);

        CompositeComputadora laboratorio2= new CompositeComputadora("SamsungLab");
        laboratorio2.add(computadora4);
        laboratorio2.add(computadora5);
        laboratorio2.add(computadora6);

        CompositeComputadora laboratorio3=new CompositeComputadora("MixLab");
        laboratorio3.add(computadora7);
        laboratorio3.add(computadora8);
        laboratorio3.add(computadora9);
        laboratorio3.add(computadora1);
        laboratorio3.add(computadora4);

        CompositeComputadora contenedor1= new CompositeComputadora("Container1");
        contenedor1.add(laboratorio);
        contenedor1.add(laboratorio2);

        CompositeComputadora contenedor2= new CompositeComputadora("Container2");
        contenedor2.add(laboratorio);
        contenedor2.add(laboratorio3);

        CompositeComputadora contenedor3= new CompositeComputadora("Container3");
        contenedor3.add(laboratorio2);
        contenedor3.add(laboratorio3);


        contenedor1.operation();
        contenedor1.showTotal();

        contenedor2.operation();
        contenedor2.showTotal();

        contenedor3.operation();
        contenedor3.showTotal();
    }
}
