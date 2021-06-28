package ejercicios3parcial.empresaApps;

import java.text.SimpleDateFormat;
import java.util.Random;

public class AppEscritorio implements iAppsPC{
    private String nombre;
    private String categoria;
    private String empresa;
    private String os="Escritorio";
    private String tipoPrograma="programa";
    private String detailintro="Iniciando sesión";

    public AppEscritorio(String nombre, String categoria, String empresa) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getTipoPrograma() {
        return tipoPrograma;
    }

    public void setTipoPrograma(String tipoPrograma) {
        this.tipoPrograma = tipoPrograma;
    }

    public String getDetailintro() {
        return detailintro;
    }

    public void setDetailintro(String detailintro) {
        this.detailintro = detailintro;
    }

    @Override
    public void iniciarSesion() {
        System.out.println(detailintro+" en "+tipoPrograma+" "+nombre+ " de "+empresa+" (Categoría: "+categoria+" )");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sesión iniciada en "+nombre+ " para "+os);
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando "+tipoPrograma+" "+nombre+ " para "+os);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sesión finalizada en "+nombre);
    }

    @Override
    public void generarDatos() {
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
        Random r= new Random();
        System.out.println("Propiedades de "+tipoPrograma+" "+nombre);
        System.out.println("Creado por: "+ empresa);
        System.out.println("Instalado desde: "+(formatter.format(System.currentTimeMillis())));
        System.out.println("Número de errores durante ejecución: "+(Math.abs(r.nextInt(5))+1));
    }
}
