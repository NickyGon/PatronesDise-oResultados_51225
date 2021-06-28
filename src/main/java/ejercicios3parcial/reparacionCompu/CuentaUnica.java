package ejercicios3parcial.reparacionCompu;

import ejercicios3parcial.componentes.Computadora;

public class CuentaUnica {
    private static CuentaUnica instance=null;
    private KitReparacion kitReparacion;
    private SistemaEmpresa sistemaEmpresa;
    private int montoAcumulado;

    private CuentaUnica(){
        System.out.println("Se inicializó la cuenta");
        montoAcumulado=0;
        kitReparacion= new KitReparacion();
        sistemaEmpresa= new SistemaEmpresa();
        sistemaEmpresa.attach(new UsuarioRegistrado(new Persona("11110923","Raul Gomez"), UsuarioRegistrado.Cargos.PRESIDENTE));
        sistemaEmpresa.attach(new UsuarioRegistrado(new Persona("11110924","Selena Cruz"), UsuarioRegistrado.Cargos.VICEPRESIDENTE));
        sistemaEmpresa.attach(new UsuarioRegistrado(new Persona("11110925","Mario Vargas"), UsuarioRegistrado.Cargos.CONTABILIDAD));
    }

    public static synchronized void makeInstance(){
        if (instance==null){
            instance= new CuentaUnica();
        }
    }

    public static CuentaUnica getInstance(){
        if (instance==null){
            makeInstance();
        }
        return instance;
    }


    public synchronized void pagar(int precio,iComputadora computadora){
        System.out.println("Haciendo pago de una computadora tipo "+computadora.getClass().getSimpleName());
        int precioCompar=0;
        if (computadora instanceof Laptop){
            precioCompar=((Laptop) computadora).getPrecio();
        } else if (computadora instanceof PC){
            precioCompar=((PC) computadora).getPrecio();
        }  else if (computadora instanceof Tablet){
            precioCompar=((Tablet) computadora).getPrecio();
        }

        if (precio>=precioCompar){
            montoAcumulado=montoAcumulado+precioCompar;
            System.out.println("Se pagaron "+precio+"Bs.");
            System.out.println("Se hizo el pago de su servicio correctamente. Gracias por su preferencia...");
            if (precio>precioCompar){
                System.out.println("Cambio de "+(precio-precioCompar)+"Bs");
            }
        } else{
            System.out.println("Gracias por su pago. Le restan "+(precioCompar-precio)+"Bs en deuda...");
            montoAcumulado=montoAcumulado+precio;
        }
        sistemaEmpresa.notifyUser(computadora,montoAcumulado);
    }
    public synchronized void repairComputadora(iComputadora computadora){
        if (computadora instanceof Laptop){
            Laptop laptop=(Laptop) computadora;
            laptop.reparar(kitReparacion);
        } else if (computadora instanceof PC) {
            PC pc= (PC) computadora;
            pc.reparar(kitReparacion);
        } else if (computadora instanceof Tablet){
            Tablet tablet=(Tablet) computadora;
            tablet.reparar(kitReparacion);
        }
    }
}
