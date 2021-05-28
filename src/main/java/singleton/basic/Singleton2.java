package singleton.basic;

public class Singleton2 {

    // Atributo del mismo tipo

    private static final Singleton2 instancia = new Singleton2();

    // Constructor privado

    private Singleton2(){
        System.out.println("Info> Instanciando Singleton2");
    }

    // Método estático público - retorna la instancia única
    public static Singleton2 getInstance(){
        return instancia;
    }

    public void print(){
        System.out.println("usando el singleton2");
    }

}
