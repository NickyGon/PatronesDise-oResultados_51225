package composite.ejercicio;


import java.util.ArrayList;
import java.util.List;

public class CompositeComputadora extends ArtefactosElectronicos {

    private List<ArtefactosElectronicos> artefactosElectronicosList = new ArrayList<>();
    private Global global;


    public CompositeComputadora (String nombregrupo){
        super(nombregrupo);
    }


    public void showTotal(){
        System.out.println("PRECIO TOTAL DEL GRUPO: "+global.getTotalE()+" $");
    }


    @Override
    public void operation() {
        System.out.println("++++++++++++++++++Entrando a grupo "+this.getNombreGrupo()+" de Computadoras: +++++++++++++++++++");
        for (ArtefactosElectronicos artefactosElectronicos : artefactosElectronicosList){
            if (artefactosElectronicos.equals(artefactosElectronicosList.get(0)) && !(artefactosElectronicos instanceof Computadora)) {
                global.setTotalE(0);
            }
            artefactosElectronicos.operation();
            if (artefactosElectronicos instanceof Computadora)
            global.setTotalE(global.getTotalE()+artefactosElectronicos.getPrecio());
        }

    }


    @Override
    public void add(ArtefactosElectronicos component) {
        artefactosElectronicosList.add(component);
    }



    @Override
    public void remove(ArtefactosElectronicos component) {
        artefactosElectronicosList.remove(component);
    }

    @Override
    public void getChild(int position) {
        artefactosElectronicosList.get(position);
    }
}
