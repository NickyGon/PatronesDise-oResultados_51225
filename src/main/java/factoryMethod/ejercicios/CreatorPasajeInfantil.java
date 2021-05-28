package factoryMethod.ejercicios;

public class CreatorPasajeInfantil extends CreatorPasajes{
    //Estableciendo el primer cliente Infantil
    @Override
    public PasajeInfantil create() {
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
        cliente.setNombre("Mario Carranza");
        cliente.setCi("11110692");
        cliente.setFechaNacimiento("29/04/2008");

        PasajeInfantil pasajeInfantil= new PasajeInfantil();
        pasajeInfantil.setNumeroDeVuelo("LA2516");
        pasajeInfantil.setDestino(destino);
        pasajeInfantil.setOrigen(origen);
        pasajeInfantil.setAvion(avion);
        pasajeInfantil.setCliente(cliente);
        pasajeInfantil.setNumeroDeAsiento("6C");
        pasajeInfantil.setCostoDelPasaje(30);

        return pasajeInfantil;
    }
}
