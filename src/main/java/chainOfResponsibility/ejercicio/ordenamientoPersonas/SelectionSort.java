package chainOfResponsibility.ejercicio.ordenamientoPersonas;

public class SelectionSort implements iOrdenamiento{

    private iOrdenamiento next;

    @Override
    public void setNext(iOrdenamiento ordenamiento) {
        this.next=ordenamiento;
    }

    @Override
    public iOrdenamiento goNext() {
        return this.next;
    }

    @Override
    public void realizarOrdenamiento(Persona[] lista) {
        if (lista.length>50 && lista.length<=100){

            for (int i=0;i<lista.length-1;i++){
                int indiceDelMinimo=i;
                for (int j=i+1;j<lista.length;j++){
                    if (lista[j].getEdad()<lista[indiceDelMinimo].getEdad()){
                        indiceDelMinimo=j;
                    }
                }
                Persona temporal=lista[indiceDelMinimo];
                lista[indiceDelMinimo]=lista[i];
                lista[i]=temporal;
            }

            System.out.println("----Lista ordenada con selectionSort----");
            for (int k=0;k<lista.length;k++){
                lista[k].showInfo();
            }
        } else {
            System.out.println("No se puede realizar el ordenamiento, la lista es demasiado grande");
        }

    }


}
