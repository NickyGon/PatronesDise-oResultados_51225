package singleton.basic;

public class Singleton4 implements Cloneable{
    // Atributo del mismo tipo

    private static Singleton4 instancia = null;

    // Constructor privado

    private Singleton4(){
        System.out.println("Info> Creando Singleton");
    }

    // Método estático público - retorna la instancia única
    public static Singleton4 getInstance(){
        if(instancia==null)
            instancia=new Singleton4();
        return instancia;
    }

    public void print(){
        System.out.println("usando el singleton");
    }

    public void restartSingleton(){
        instancia=null;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
