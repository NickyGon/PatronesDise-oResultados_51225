package factoryMethod.ejercicios;

public class CreatorPasajeEstandar extends CreatorPasajes{
    //Estableciendo el primer cliente Estandar
    @Override
    public PasajeEstandar create() {
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
        cliente.setNombre("Jorge Gonzalo");
        cliente.setCi("11119065");
        cliente.setFechaNacimiento("27/10/2000");

        PasajeEstandar pasajeEstandar= new PasajeEstandar();
        pasajeEstandar.setNumeroDeVuelo("LA2516");
        pasajeEstandar.setDestino(destino);
        pasajeEstandar.setOrigen(origen);
        pasajeEstandar.setAvion(avion);
        pasajeEstandar.setCliente(cliente);
        pasajeEstandar.setNumeroDeAsiento("7A");
        pasajeEstandar.setCostoDelPasaje(325);

        return pasajeEstandar;
    }
}
