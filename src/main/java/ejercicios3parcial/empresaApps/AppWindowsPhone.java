package ejercicios3parcial.empresaApps;

import java.text.SimpleDateFormat;
import java.util.Random;

public class AppWindowsPhone implements iAppsPhone{

    private String nombre;
    private String categoria;
    private String empresa;
    private String os="WindowsPhone";
    private String tipoPrograma="aplicación";
    private String detailintro="Conectando";


    public AppWindowsPhone(String nombre, String categoria, String empresa) {
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

    public String getTipoPrograma() {
        return tipoPrograma;
    }

    public void setTipoPrograma(String tipoPrograma) {
        this.tipoPrograma = tipoPrograma;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getDetailintro() {
        return detailintro;
    }

    public void setDetailintro(String detailintro) {
        this.detailintro = detailintro;
    }

    @Override
    public void logIn() {
        System.out.println(detailintro+" a "+tipoPrograma+" "+nombre+" de "+empresa+" (Categoría: "+categoria+")");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(tipoPrograma+" "+nombre+" en ejecución y conectado al dispositivo "+os);
    }

    @Override
    public void logOut() {
        System.out.println("Dispositivo "+os+" desconectándose de "+nombre);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Conexión a "+tipoPrograma+" "+nombre+" finalizado correctamente");
    }

    @Override
    public void reportes() {
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
        Random r= new Random();
        System.out.println("Detalles de la ejecución de "+tipoPrograma+" "+nombre);
        System.out.println("Empresa creadora: "+ empresa);
        System.out.println("Instalado desde: "+(formatter.format(System.currentTimeMillis())));
        System.out.println("Numero de ejecuciones diarias: "+(Math.abs(r.nextInt(12))+1));
    }
}
