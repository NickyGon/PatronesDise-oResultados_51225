package singleton.basic;

public class Singleton3 {
    // Atributo del mismo tipo

    public static Singleton3 instancia = null;

    // Constructor privado

    private synchronized static void makeInstance(){
        if(instancia==null)
            instancia=new Singleton3();
    }

    private Singleton3(){
        System.out.println("Info> Creando Singleton");
    }

    // Método estático público - retorna la instancia única
    public static Singleton3 getInstance(){
        if(instancia==null)
            makeInstance();
        return instancia;
    }

    public void print(){
        System.out.println("usando el singleton");
    }

}

