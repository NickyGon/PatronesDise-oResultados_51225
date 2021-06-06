package memento.basic;

public class Client {
    public static void main(String[]args){
        //el careTaker es el que guarda lo mementos
        Carataker carataker=new Carataker();
        //el originator es el creador de los mementos
        Originator originator=new Originator();

        ConcreteObject concreteObject;

        concreteObject=new ConcreteObject("Doc","Titulo","Estado1");
        originator.setState(concreteObject);

        concreteObject=new ConcreteObject("Doc","Descripcion","Estado2");
        originator.setState(concreteObject);
        carataker.addMemento(originator.createMemento()); // [0] Primer estado

        concreteObject=new ConcreteObject("Doc","Resumen","Estado3");
        originator.setState(concreteObject);

        concreteObject=new ConcreteObject("Doc","Conclusion","Estado4");
        originator.setState(concreteObject);
        carataker.addMemento(originator.createMemento()); //[1] Segundo estado

        concreteObject=new ConcreteObject("Doc","Bibliografia","Estado5");
        originator.setState(concreteObject);

        //recuperando o restaurando un estado

        originator.restoreFromMemento(carataker.getMemento(0));

    }
}
