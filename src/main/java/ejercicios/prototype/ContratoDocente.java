package ejercicios.prototype;

public class ContratoDocente implements iContrato{

    private int Sueldo;
    private int cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean AccesoPlataforma;
    private boolean MarcadoBiometrico;
    private String marcadoHoraEntrada;
    private String marcadoHoraSalida;
    private String nombre;
    private String apellido;

    public ContratoDocente(){

    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int sueldo) {
        Sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public boolean isAccesoPlataforma() {
        return AccesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        AccesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcadoBiometrico() {
        return MarcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        MarcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoHoraEntrada() {
        return marcadoHoraEntrada;
    }

    public void setMarcadoHoraEntrada(String marcadoHoraEntrada) {
        this.marcadoHoraEntrada = marcadoHoraEntrada;
    }

    public String getMarcadoHoraSalida() {
        return marcadoHoraSalida;
    }

    public void setMarcadoHoraSalida(String marcadoHoraSalida) {
        this.marcadoHoraSalida = marcadoHoraSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Object clone() {
        ContratoDocente contratoDocente=new ContratoDocente();
        contratoDocente.setAccesoPlataforma(this.AccesoPlataforma);
        contratoDocente.setApellido(this.apellido);
        contratoDocente.setCargaHoraria(this.cargaHoraria);
        contratoDocente.setCursoEducacionSuperior(this.cursoEducacionSuperior);
        contratoDocente.setMarcadoHoraEntrada(this.marcadoHoraEntrada);
        contratoDocente.setMarcadoHoraSalida(this.marcadoHoraSalida);
        contratoDocente.setMarcadoBiometrico(this.MarcadoBiometrico);
        contratoDocente.setNombre(this.nombre);
        contratoDocente.setSueldo(this.Sueldo);
        return contratoDocente;
    }

    public void showInfo(){
        System.out.println("********Contrato de Docente********");
        System.out.println("Sueldo: "+Sueldo);
        System.out.println("Carga Horaria: "+cargaHoraria);
        System.out.println("Curso de Educación Superior: "+cursoEducacionSuperior);
        System.out.println("Acceso a la plataforma: "+AccesoPlataforma);
        System.out.println("Marcado Biométrico: "+MarcadoBiometrico);
        System.out.println("Marcado de Hora de Entrada: "+marcadoHoraEntrada);
        System.out.println("Marcado de Hora de Salida: "+marcadoHoraSalida);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }
}
