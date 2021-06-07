package chainOfResponsibility.ejercicio.ordenamientoPersonas;

public class InsertionSort implements iOrdenamiento{

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
        if (lista.length<=20){
            for (int j=1;j< lista.length;j++){
                Persona actual=lista[j];
                int edadActual=actual.getEdad();
                int i=j-1;
                while ((i>-1) && (lista[i].getEdad()>edadActual)){
                    lista[i+1]=lista[i];
                    i--;
                }
                lista[i+1]=actual;
            }
            System.out.println("----Lista ordenada con insertionSort----");
            for (int k=0;k<lista.length;k++){
                lista[k].showInfo();
            }
        } else {
            this.next.realizarOrdenamiento(lista);
        }

    }


}
