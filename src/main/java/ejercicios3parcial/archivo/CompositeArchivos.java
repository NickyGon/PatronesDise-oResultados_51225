package ejercicios3parcial.archivo;

import java.util.ArrayList;
import java.util.List;

public class CompositeArchivos extends Archivo{
    private List<Archivo> archivoList= new ArrayList<>();
    private Global global;

    public CompositeArchivos(String nombreCar) {
        super(nombreCar);
    }
    public void showTotal(){
        System.out.println("Total de palabras dentro de "+this.getNombreCar()+": "+this.global.getTotalE());
    }

    private int enter=0;
    @Override
    public void operation() {

        System.out.println("++++++++++++++++++Entrando a "+this.getNombreCar()+"+++++++++++++++++++");
        int itero=0;
        for (Archivo archivo: archivoList){
            if ((archivoList.get(itero) instanceof ArchivoSimple && itero==0)) {
                if (this.global.getTotalE()==0 || (this.global.getTotalE()>0 && enter==0))
                this.global.setTotalE(0);
                enter=1;

            } else if ((archivoList.size()>1 && itero==0 )){
                this.global.setTotalE(0);
            }
            archivo.operation();
            if (archivo instanceof ArchivoSimple){
                this.global.setTotalE(this.global.getTotalE()+archivo.getNumeroPalabras());
            }
            itero++;

        }

    }

    @Override
    public void addArchivo(Archivo archivo) {
        archivoList.add(archivo);
    }

    @Override
    public void remove(Archivo archivo) {
        archivoList.remove(archivo);
    }

    @Override
    public void getChild(int position) {
        archivoList.get(position);
    }
}
