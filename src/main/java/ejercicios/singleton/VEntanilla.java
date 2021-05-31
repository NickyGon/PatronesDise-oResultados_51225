package ejercicios.singleton;

public class VEntanilla {
    private static VEntanilla instance=null;
    private Cajero cajero;
    private int saldo;

    public VEntanilla(Cajero cajero) {
        this.cajero = cajero;
        this.saldo = saldo;
    }

    public static VEntanilla getInstance(Cajero cajero){
        if(instance==null)
            instance=new VEntanilla(cajero);
        return instance;
    }

    public void pagarMatricula(int amount,Estudiante estudiante){
        saldo=saldo+amount;
        System.out.println("*************************");
        System.out.println("CAjero Codigo: "+this.cajero.getCodigo()+"\n Nombre: "+this.cajero.getNombre());
        System.out.println("Estudiante: "+estudiante.getNombre());

    }

    public Integer getSaldo(){
        System.out.println("Saldo: "+this.saldo);
        return this.saldo;
    }
}
