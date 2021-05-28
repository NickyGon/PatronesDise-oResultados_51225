package factoryMethod.ejercicios;

public class Client {
    public static void main(String[]args){

        CreatorPasajes pE= new CreatorPasajeEstandar();
        CreatorPasajes pE2= new CreatorPasajeEstandar();

        //Creando un nuevo pasaje Estandar del anterior creado, cambiando datos
        //de persona y numero de asiento
        PasajeEstandar pasE=(PasajeEstandar) pE2.create();
        Cliente cli1=new Cliente();
        cli1.setNombre("Pino Morales");
        cli1.setCi("11093728");
        cli1.setFechaNacimiento("28/09/2000");
        pasE.setCliente(cli1);
        pasE.setNumeroDeAsiento("7B");

        pE.create().crear();
        pasE.crear();

        System.out.println("********************");

        CreatorPasajes pS= new CreatorPasajeSolidario();
        CreatorPasajes pS2= new CreatorPasajeSolidario();
        //Creando un nuevo pasaje Solitario del anterior creado, cambiando datos
        //de persona y numero de asiento
        PasajeSolidario pasS=(PasajeSolidario) pS2.create();
        Cliente cli2=new Cliente();
        cli1.setNombre("Carmela Rosales");
        cli1.setCi("11284423");
        cli1.setFechaNacimiento("27/10/1996");
        pasS.setCliente(cli2);
        pasS.setNumeroDeAsiento("9L");
        pasS.setDescuento(80);
        pasS.setMotivoDescuento("No tiene más recursos para quedarse mas tiempo en el país");

        pS.create().crear();
        pasS.crear();

        System.out.println("********************");

        CreatorPasajes pI= new CreatorPasajeInfantil();
        CreatorPasajes pI2= new CreatorPasajeInfantil();

        //Creando un nuevo pasaje Infantil del anterior creado, cambiando datos
        //de persona y numero de asiento
        PasajeInfantil pasI=(PasajeInfantil) pI2.create();
        Cliente cli3=new Cliente();
        cli3.setNombre("Manuela Mollinedo");
        cli3.setCi("11339900");
        cli3.setFechaNacimiento("12/12/2007");
        pasI.setCliente(cli3);
        pasI.setNumeroDeAsiento("3A");

        pI.create().crear();
        pasI.crear();

        System.out.println();
    }
}
