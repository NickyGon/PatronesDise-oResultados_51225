package template.basic;

public abstract class AbstractClass {
    abstract void method1();
    abstract void method2();

    /*
    Tipos de acceso a atributos segun su tipo:
    Private--->Solo en la misma clase
    protected--->en todo el paquete
    public--->acceso global
     */

    public void method3(){
        System.out.println("AbstractClass Llamando al metodo 3");
    }

    public final void method4(){
        System.out.println("AbstractClass Llamando al metodo 4 inescribible");
    }
    public void method5(){
        System.out.println("AbstractClass Llamando al metodo 5");
    }

}
