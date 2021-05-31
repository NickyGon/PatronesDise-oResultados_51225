package ejercicios.IteratorOficial;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[]args){
        Jalasoft jalasoft=new Jalasoft();
        jalasoft.add(new Empleado("juan","Arreglo","1119065"));
        jalasoft.add(new Empleado("Juan2","Arreglo","1138394"));
        jalasoft.add(new Empleado("Juan3","Ojo","11321494"));

        Truextend truextend=new Truextend();
        truextend.add(new Empleado("juan4","Arreglo","1"));
        truextend.add(new Empleado("Juan5","Arreglo","2"));
        truextend.add(new Empleado("Juan6","Ojo","3"));

        Mojix mojix=new Mojix();
        mojix.add(new Empleado("juan7","Arreglo","4"));
        mojix.add(new Empleado("Juan8","Arreglo","5"));
        mojix.add(new Empleado("Juan9","Ojo","6"));

        Avantica avantica=new Avantica();
        avantica.add(new Empleado("juan10","Arreglo","7"));
        avantica.add(new Empleado("Juan11","Arreglo","8"));
        avantica.add(new Empleado("Juan12","Ojo","9"));


        Map<String,Empleado> google=new HashMap<>();
        Iterator iterator= mojix.iterator();
        while (iterator.hasNext()){
            Empleado empleado=(Empleado) iterator.next();
            google.put(empleado.getCi(),empleado);
        }


        iterator= jalasoft.iterator();
        while (iterator.hasNext()){
            Empleado empleado=(Empleado) iterator.next();
            google.put(empleado.getCi(),empleado);
        }



        iterator= avantica.iterator();
        while (iterator.hasNext()){
            Empleado empleado=(Empleado) iterator.next();
            google.put(empleado.getCi(),empleado);
        }
        iterator= truextend.iterator();
        while (iterator.hasNext()){
            Empleado empleado=(Empleado) iterator.next();
            google.put(empleado.getCi(),empleado);
        }

        for(String s:google.keySet()){
            System.out.println(google.get(s).getNombre());
        }

    }


}
