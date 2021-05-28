package abstractFactory.ejercicios.Aviones;

public class Client {
    public static void main(String[]args){
        PasajeEstandar a1=(PasajeEstandar) FactoryPasaje.make(FactoryPasaje.Pasaje.ESTANDAR);
        a1.setCliente(new Cliente("Jose Carreras","11788394","27/10/2000"));
        a1.setNumeroDeAsiento("7A");
        a1.crear();

        PasajeEstandar a2=(PasajeEstandar) FactoryPasaje.make(FactoryPasaje.Pasaje.ESTANDAR);
        a2.setCliente(new Cliente("Maria Mercedes","11006789","11/04/2000"));
        a2.setNumeroDeAsiento("7B");
        a2.crear();

        PasajeInfantil a3=(PasajeInfantil) FactoryPasaje.make(FactoryPasaje.Pasaje.INFANTIL);
        a3.setCliente(new Cliente("Mario Marcelo","11904683","14/11/2015"));
        a3.setNumeroDeAsiento("6C");
        a3.crear();

        PasajeInfantil a4=(PasajeInfantil) FactoryPasaje.make(FactoryPasaje.Pasaje.INFANTIL);
        a4.setCliente(new Cliente("Flor de la V","11244356","08/06/2010"));
        a4.setNumeroDeAsiento("6B");
        a4.crear();

        PasajeSolidario a5=(PasajeSolidario) FactoryPasaje.make(FactoryPasaje.Pasaje.SOLIDARIO);
        a5.setCliente(new Cliente("Rosario Jimenez","1111612","16/07/1996"));
        a5.setNumeroDeAsiento("4K");
        a5.setDescuento(70);
        a5.setMotivoDescuento("No tiene más recursos para quedarse en el pais");
        a5.crear();

        PasajeSolidario a6=(PasajeSolidario) FactoryPasaje.make(FactoryPasaje.Pasaje.SOLIDARIO);
        a6.setCliente(new Cliente("Tobias Horacio","11111802","18/11/1999"));
        a6.setNumeroDeAsiento("3L");
        a6.setDescuento(60);
        a6.setMotivoDescuento("Necesita tratamiento médico en otro país");
        a6.crear();
    }
}
