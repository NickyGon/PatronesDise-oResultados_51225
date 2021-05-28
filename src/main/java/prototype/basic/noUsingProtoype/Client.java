package prototype.basic.noUsingProtoype;

import prototype.basic.ConcretePrototype;

public class Client {
    public static void main(String[]args){
        ConcretePrototype obj1=new ConcretePrototype();

        obj1.setAttribute1(5);
        obj1.setAttribute2("Pasta: Objeto 1");
        System.out.println("OBJ1> " + obj1.getAttribute2());

        ConcretePrototype obj2= (ConcretePrototype) obj1.clone();
        System.out.println("OBJ2> " + obj2.getAttribute2());
        System.out.println("*************");

        obj2.setAttribute2("Pizza: Objeto 2");
        System.out.println("OBJ1> " + obj1.getAttribute2());
        System.out.println("OBJ2> " + obj2.getAttribute2());
    }
}
