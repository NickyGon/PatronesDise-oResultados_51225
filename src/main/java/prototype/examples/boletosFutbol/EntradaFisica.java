package prototype.examples.boletosFutbol;

public class EntradaFisica implements iEntradaFutbol{

    private String equipoVisitante;
    private String equipoLocal;
    private String numeroAsiento;
    private String fecha;
    private String lugar;
    private String precio;
    private String categoria;
    private String nit;
    private String factura;
    private Persona persona;
    private Tiempo time;

    public EntradaFisica(){

    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Tiempo getTime() {
        return time;
    }

    public void setTime(Tiempo time) {
        this.time = time;
    }

    @Override
    public Object clone() {
        EntradaFisica objClone=new EntradaFisica();
        objClone.setCategoria(this.categoria);
        objClone.setEquipoLocal(this.equipoLocal);
        objClone.setEquipoVisitante(this.equipoVisitante);
        objClone.setFactura(this.factura);
        objClone.setLugar(this.lugar);
        objClone.setFecha(this.fecha);
        objClone.setNit(this.nit);
        objClone.setPrecio(this.precio);
        objClone.setNumeroAsiento(this.numeroAsiento);
        objClone.setPersona(this.persona);
        objClone.time=this.time;
        return objClone;
    }

    public void showInfo(){
        System.out.println("**********************************");
        System.out.println("Equipo Visitante: "+equipoVisitante);
        System.out.println("Equipo local: "+equipoLocal);
        System.out.println("Número de asiento: "+numeroAsiento);
        System.out.println("Fecha: "+fecha);
        System.out.println("Lugar: "+lugar);
        System.out.println("Precio: "+precio);
        System.out.println("Categoría: "+categoria);
        System.out.println("NIT: "+nit);
        System.out.println("Factura: "+factura);
        System.out.println("CI: "+ persona.getCi());
        System.out.println("Nombre: "+persona.getNombre());


    }
}
