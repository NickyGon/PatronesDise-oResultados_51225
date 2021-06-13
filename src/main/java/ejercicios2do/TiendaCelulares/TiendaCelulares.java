package ejercicios2do.TiendaCelulares;

import java.util.ArrayList;
import java.util.List;

public class TiendaCelulares {
    private iAlgoritmo algoritmo;
    private List<Celular> celularList=new ArrayList<>();

    public TiendaCelulares(){}

    public iAlgoritmo getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo() {
        if (this.celularList.size()<=15){
            this.algoritmo= new AlgoritmoMenor();
        } else {
            this.algoritmo=new AlgoritmoMayor();
        }
    }

    public List<Celular> getCelularList() {
        return celularList;
    }

    public void setCelularList(List<Celular> celularList) {
        this.celularList = celularList;
    }

    public void buscarCelulares(String modelo, int precio){
        System.out.println("Buscando celular en la lista de celulares (Tamaño: "+this.celularList.size()+")");
        System.out.println("Entrada: Precio a aproximar: "+precio+"Bs. | Modelo: "+modelo);
        algoritmo.buscar(this.celularList,modelo,precio);
    }

}
