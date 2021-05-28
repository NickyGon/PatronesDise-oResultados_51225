package singleton.basic;

public class Client3 {
    public static void main(String[]args){

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton3 singleton=Singleton3.getInstance();
                System.out.println("Memory section: "+singleton.hashCode());
                singleton.print();
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton3 singleton2=Singleton3.getInstance();
                System.out.println("Memory section: "+Singleton3.getInstance().hashCode());
                singleton2.print();
            }
        });

        thread1.start();
        thread2.start();
    }
}
