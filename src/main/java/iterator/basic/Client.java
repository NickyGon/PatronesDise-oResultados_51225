package iterator.basic;

public class Client {
    public static void main(String[]args){
        ListA listA=new ListA();
        listA.add("Jose");
        listA.add("Nicky");
        listA.add("Maria");
        listA.add("Raul");
        listA.add("Raul2");

        ListB listB=new ListB();
        listB.add("Jose");
        listB.add("Nicky");
        listB.add("Maria");
        listB.add("Raul");

        Iterator iterator=listA.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre: "+iterator.next());
        }

        Iterator iterator2=listB.iterator();
        while (iterator2.hasNext()){
            System.out.println("Nombre: "+iterator2.next());
        }
    }
}

