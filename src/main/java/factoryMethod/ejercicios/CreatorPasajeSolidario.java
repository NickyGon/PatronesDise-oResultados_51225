package factoryMethod.ejercicios;

public class CreatorPasajeSolidario extends CreatorPasajes{
    //Estableciendo el primer cliente Solidario
    @Override
    public PasajeSolidario create() {
        Destino destino= new Destino();
        destino.setPais("Perú");
        destino.setCiudad("Lima");
        destino.setAeroupuerto("Aeropuerto Internacional Jorge Chavez");

        Origen origen= new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("La Paz");
        origen.setAeroupuerto("Aeropuerto Internacional El Alto");

        Avion avion=new Avion();
        avion.setMarca("LATAM");
        avion.setCapacidad(144);
        avion.setModelo("A319");

        Cliente cliente=new Cliente();
        cliente.setNombre("María Mercedes");
        cliente.setCi("11170384");
        cliente.setFechaNacimiento("3/11/1995");

        PasajeSolidario pasajeSolidario= new PasajeSolidario();
        pasajeSolidario.setNumeroDeVuelo("LA2516");
        pasajeSolidario.setDestino(destino);
        pasajeSolidario.setOrigen(origen);
        pasajeSolidario.setAvion(avion);
        pasajeSolidario.setCliente(cliente);
        pasajeSolidario.setNumeroDeAsiento("8K");
        pasajeSolidario.setCostoDelPasaje(325);
        pasajeSolidario.setDescuento(70);
        pasajeSolidario.setMotivoDescuento("Necesidad de ir a un hospital por trabajo");

        return pasajeSolidario;
    }
}
