package abstractFactory.ejercicios.Aviones;

public class PasajeSolidario implements iPasaje {
    private String numeroDeVuelo;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Cliente cliente;
    private String numeroDeAsiento;
    private int costoDelPasaje;
    private int descuento;
    private String motivoDescuento;


    public PasajeSolidario() {
        this.destino = destino;
        this.origen = origen;
        this.avion = avion;
        this.cliente = cliente;
    }

    public String getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(String numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroDeAsiento() {
        return numeroDeAsiento;
    }

    public void setNumeroDeAsiento(String numeroDeAsiento) {
        this.numeroDeAsiento = numeroDeAsiento;
    }

    public int getCostoDelPasaje() {
        return costoDelPasaje;
    }

    public void setCostoDelPasaje(int costoDelPasaje) {
        this.costoDelPasaje = costoDelPasaje;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.motivoDescuento = motivoDescuento;
    }


    @Override
    public void crear() {
        System.out.println("----PASAJE SOLIDARIO----");
        System.out.println("Número de vuelo: "+numeroDeVuelo);
        destino.showInfo();
        origen.showInfo();
        avion.showInfo();
        cliente.showInfo();
        System.out.println("Numero de Asiento: "+numeroDeAsiento);
        System.out.println("Costo del pasaje sin descuento: "+costoDelPasaje+"$");
        System.out.println("Descuento: "+descuento+"%"+". Pago con descuento: "+discount()+"$");
        System.out.println("Motivo: "+motivoDescuento);
    }

    //Metodo para obtener el descuento
    public int discount(){
        double x= (double) descuento/(double) 100;
        int disc= (int) Math.round(costoDelPasaje*((1-x)));
        return disc;
    }
}
