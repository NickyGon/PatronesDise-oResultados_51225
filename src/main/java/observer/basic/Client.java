package observer.basic;

import memento.basic.ConcreteObject;

public class Client {
    public static void main(String[]args){
        ConcreteSubject concreteSubject=new ConcreteSubject();

        concreteSubject.attach(new ConcreteObserver());
        concreteSubject.attach(new ConcreteObserver2());

        concreteSubject.setAttribute2("Modificando");
        concreteSubject.setAttribute1("No");
        concreteSubject.setAttribute2("notificame");

    }
}
