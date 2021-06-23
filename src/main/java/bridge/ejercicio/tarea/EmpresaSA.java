package bridge.ejercicio.tarea;

public class EmpresaSA implements iEmpresas{

    private String name;
    private iEnvioPaquete envioPaquete;

    public EmpresaSA(String name,iEnvioPaquete envioPaquete){
        this.envioPaquete=envioPaquete;
        this.name=name;
    }


    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("----------------------");
        System.out.println("Envío en proceso por Empresa "+name+" SA");
        System.out.println("Precio original: "+ paquete.getPrecio());
        envioPaquete.controlarPrecio(paquete);
        paquete.info();
        System.out.println("----------------------");
    }
}
