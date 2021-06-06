package singleton.ejercicioAccesible;


public class EmpresaDeCambio {
    private static EmpresaDeCambio instance=null;

    private EmpresaDeCambio(){
        System.out.println("Inicializando el programa");
    }

    public static synchronized void makeInstance(){
        if (instance==null)
            instance=new EmpresaDeCambio();
    }

    public static EmpresaDeCambio getInstance(){
        if (instance==null)
            makeInstance();
        return instance;
    }

    public synchronized void getChange(String origin,int amount,String type,String objective){
       double change=amount*analyzeMultiplier(type,objective);
       System.out.println(origin+"<---"+amount+type+"--->"+change+objective);
    }

    private double analyzeMultiplier(String type, String objective) {
        double result=0.0;
        switch (type+objective) {
            case "BsE":
                result = 0.12;
                break;
            case "Bs$":
                result = 0.15;
                break;
            case "EBs":
                result = 8.43;
                break;
            case "E$":
                result = 1.22;
                break;
            case "$E":
                result = 0.82;
                break;
            case "$Bs":
                result = 6.96;
                break;
            default:
                break;
        }
        return result;
    }


    public void info(String info) {
        System.out.println("INFO > "+info);
    }
}
