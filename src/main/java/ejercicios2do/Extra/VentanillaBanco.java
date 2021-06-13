package ejercicios2do.Extra;


public class VentanillaBanco implements iPersonalBanco{
    private static VentanillaBanco instance=null;
    private iPersonalBanco siguiente;
    private int montoPagado;

    private VentanillaBanco(){
        System.out.println("Sistema iniciado");
       this.montoPagado=0;
    }

    public static synchronized void makeInstance(){
        if (instance==null){
            instance=new VentanillaBanco();
        }
    }

    public static VentanillaBanco getInstance(){
        if (instance==null){
            makeInstance();
        }
        return instance;
    }
    @Override
    public void setSiguiente(iPersonalBanco personal) {
        this.siguiente=personal;
    }

    @Override
    public iPersonalBanco alSiguiente() {
        return this.siguiente;
    }

    @Override
    public void realizarAccion(Cuenta cuenta,int monto) {
        System.out.println("Se paga un monto de "+monto+"Bs al préstamo");
        montoPagado=montoPagado+monto;
        Cajero cajero=new Cajero();
        this.setSiguiente(cajero);
        AgenteCredito agenteCredito=new AgenteCredito();
        cajero.setSiguiente(agenteCredito);
        Supervisor supervisor=new Supervisor();
        agenteCredito.setSiguiente(supervisor);
        Encargado encargado=new Encargado();
        supervisor.setSiguiente(encargado);
        this.siguiente.realizarAccion(cuenta,montoPagado);

        System.out.println();
    }

    public void info(String info) {
        System.out.println("INFO > "+info);
    }
}
