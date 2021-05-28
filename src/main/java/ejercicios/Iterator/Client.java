package ejercicios.Iterator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Client {
    public static void main(String[]args){

        Empleado e1=new Empleado("Jose");
        Empleado e2=new Empleado("Juan");
        Empleado e3=new Empleado("Juana");
        Empleado e4=new Empleado("Siro");
        Empleado e5=new Empleado("Nero");
        Empleado e6=new Empleado("Jipi");
        Empleado e7=new Empleado("Jope");
        Empleado e8=new Empleado("Manuel");
        Empleado e9=new Empleado("Lola");
        Empleado e10=new Empleado("Lord");
        Empleado e11=new Empleado("Jorge");
        Empleado e12=new Empleado("Jotaro");
        Empleado e13=new Empleado("Nino");
        Empleado e14=new Empleado("Nelson");
        Empleado e15=new Empleado("Sara");
        Empleado e16=new Empleado("Kayla");
        Empleado e17=new Empleado("May");
        Empleado e18=new Empleado("Mary");
        Empleado e19=new Empleado("Michelle");
        Empleado e20=new Empleado("Peter");


        Map<String,Object> empleadoMap=new HashMap<String,Object>();

        ListList listA=new ListList();
        listA.add(e1);
        listA.add(e2);
        listA.add(e3);
        listA.add(e4);
        listA.add(e5);

        ListArr listB=new ListArr();
        listB.add(e6);
        listB.add(e7);
        listB.add(e8);
        listB.add(e9);
        listB.add(e10);

        ListVector listC=new ListVector();
        listC.add(e11);
        listC.add(e12);
        listC.add(e13);
        listC.add(e14);
        listC.add(e15);

        ListStack listD=new ListStack();
        listD.add(e16);
        listD.add(e17);
        listD.add(e18);
        listD.add(e19);
        listD.add(e20);

        int counter=1;
        System.out.println("Lista de Empleados");
        Iterator iterator=listA.iterator();
        while (iterator.hasNext()){
            Object o=iterator.next();
            empleadoMap.put(Integer.toString(counter++),o);
            System.out.println("Nombre: "+o);
        }

        System.out.println("Array de Empleados");
        Iterator iterator2=listB.iterator();
        while (iterator2.hasNext()){
            Object o=iterator2.next();
            empleadoMap.put(Integer.toString(counter++),o);
            System.out.println("Nombre: "+o);
        }

        System.out.println("Vector de Empleados");
        Iterator iterator3=listC.iterator();
        while (iterator3.hasNext()){
            Object o=iterator3.next();
            empleadoMap.put(Integer.toString(counter++),o);
            System.out.println("Nombre: "+o);
        }

        System.out.println("Stack de Empleados");
        Iterator iterator4=listD.iterator();
        while (iterator4.hasNext()){
            Object o=iterator4.next();
            empleadoMap.put(Integer.toString(counter++),o);
            System.out.println("Nombre: "+o);
        }

        System.out.println("Hash Map de Empleados");
        Map<String,Object> sort=new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int difference= Integer.parseInt(o1)-Integer.parseInt(o2);
                if (difference!=0) return difference;
                return o1.compareTo(o2);
            }
        });
        sort.putAll(empleadoMap);
        sort.entrySet().forEach(System.out::println);

    }
}
