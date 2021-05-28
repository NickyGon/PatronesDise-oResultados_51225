package abstractFactory.ejercicios.Aviones;


public class FactoryPasaje {
    enum Pasaje{
        ESTANDAR,SOLIDARIO,INFANTIL
    }

    public static iPasaje make(Pasaje type){
        iPasaje pasaje;

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
        switch (type){
            case ESTANDAR:
                pasaje=new PasajeEstandar();
                ((PasajeEstandar)pasaje).setAvion(avion);
                ((PasajeEstandar)pasaje).setCliente(new Cliente());
                ((PasajeEstandar)pasaje).setCostoDelPasaje(325);
                ((PasajeEstandar)pasaje).setDestino(destino);
                ((PasajeEstandar)pasaje).setOrigen(origen);
                ((PasajeEstandar)pasaje).setNumeroDeVuelo("LA2516");
                ((PasajeEstandar)pasaje).setNumeroDeAsiento("");
                break;
            case INFANTIL:
                pasaje=new PasajeInfantil();
                ((PasajeInfantil)pasaje).setAvion(avion);
                ((PasajeInfantil)pasaje).setCliente(new Cliente());
                ((PasajeInfantil)pasaje).setCostoDelPasaje(50);
                ((PasajeInfantil)pasaje).setDestino(destino);
                ((PasajeInfantil)pasaje).setOrigen(origen);
                ((PasajeInfantil)pasaje).setNumeroDeVuelo("LA2516");
                ((PasajeInfantil)pasaje).setNumeroDeAsiento("");
                break;
            case SOLIDARIO:
                pasaje=new PasajeSolidario();
                ((PasajeSolidario)pasaje).setAvion(avion);
                ((PasajeSolidario)pasaje).setCliente(new Cliente());
                ((PasajeSolidario)pasaje).setCostoDelPasaje(325);
                ((PasajeSolidario)pasaje).setDestino(destino);
                ((PasajeSolidario)pasaje).setOrigen(origen);
                ((PasajeSolidario)pasaje).setNumeroDeVuelo("LA2516");
                ((PasajeSolidario)pasaje).setNumeroDeAsiento("");
                ((PasajeSolidario)pasaje).setDescuento(0);
                ((PasajeSolidario)pasaje).setMotivoDescuento("");
                break;
            default:
                pasaje=null;
                break;
        }
        return pasaje;
    }
}
