package template.basic;

public class Concrete1 extends AbstractClass{

    @Override
    void method1() {
        System.out.println("implementando metodo 1");
    }

    @Override
    void method2() {
        System.out.println("implementando metodo 2");
    }

    @Override
    public void method3(){
        System.out.println("SobreEscribiendo el metodo 3: Concrete1 creando metodo3");
    }
}
