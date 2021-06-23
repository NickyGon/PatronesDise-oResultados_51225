package bridge.ejercicio.tarea;

public class EmpresaSRL implements iEmpresas{

    private String name;
    private iEnvioPaquete envioPaquete;

    public EmpresaSRL(String name,iEnvioPaquete envioPaquete){
        this.envioPaquete=envioPaquete;
        this.name=name;
    }

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("----------------------");
        System.out.println("Envío en proceso por "+name+ "SRL");
        System.out.println("Precio original: "+ paquete.getPrecio());
        envioPaquete.controlarPrecio(paquete);
        paquete.info();
        System.out.println("----------------------");
    }
}
