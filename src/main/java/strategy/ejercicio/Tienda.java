package strategy.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private iEstacion estacion;
    private List<Ropa> listaProductos=new ArrayList<>();
    private String nombre;

    public Tienda(){}

    public iEstacion getEstacion() {
        return estacion;
    }

    public void setEstacion(iEstacion estacion) {
        this.estacion = estacion;
    }

    public List<Ropa> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Ropa> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerEstrategia(){
        System.out.println("----"+nombre+", sello de calidad----");
        estacion.establecerPrecios(this.listaProductos);
    }
}
