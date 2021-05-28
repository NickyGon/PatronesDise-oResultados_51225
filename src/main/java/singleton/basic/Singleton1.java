package singleton.basic;

public class Singleton1 {
    // Atributo del mismo tipo

    private static Singleton1 instancia = null;

    // Constructor privado

    private Singleton1(){
        System.out.println("Info> Creando Singleton");
    }

    // Método estático público - retorna la instancia única
    public static Singleton1 getInstance(){
        if(instancia==null)
            instancia=new Singleton1();
        return instancia;
    }

    public void print(){
        System.out.println("usando el singleton");
    }

    public void restartSingleton(){
        instancia=null;
    }

}
