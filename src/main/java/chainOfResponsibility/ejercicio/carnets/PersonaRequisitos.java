package chainOfResponsibility.ejercicio.carnets;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonaRequisitos {
    //Datos personales
    private String nombre;
    private int edad;
    private String departamento;
    private Date fechaDeNacimiento;
    //Datos esenciales
    private boolean certificadoDeNacimiento;
    private int pagoAlBanco;
    private int ficha;

    public PersonaRequisitos(String nombre, int edad, String departamento, Date fechaDeNacimiento, boolean certificadoDeNacimiento, int pagoAlBanco, int ficha) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.certificadoDeNacimiento = certificadoDeNacimiento;
        this.pagoAlBanco = pagoAlBanco;
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public boolean isCertificadoDeNacimiento() {
        return certificadoDeNacimiento;
    }

    public void setCertificadoDeNacimiento(boolean certificadoDeNacimiento) {
        this.certificadoDeNacimiento = certificadoDeNacimiento;
    }

    public int getPagoAlBanco() {
        return pagoAlBanco;
    }

    public void setPagoAlBanco(int pagoAlBanco) {
        this.pagoAlBanco = pagoAlBanco;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    public void showPersonalInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Departamento: " + departamento);
        System.out.println("Fecha de nacimiento: " + formato.format(fechaDeNacimiento));
        System.out.print("Monto de pago al banco: " + pagoAlBanco + "Bs");
        if (pagoAlBanco - 100 > 0) {
            System.out.println(" (cambio: " + (pagoAlBanco - 100) + "Bs)");
        } else{
            System.out.println();
        }
        System.out.println("Ficha: "+ficha);
    }
}
