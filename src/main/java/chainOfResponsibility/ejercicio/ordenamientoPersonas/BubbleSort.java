package chainOfResponsibility.ejercicio.ordenamientoPersonas;

public class BubbleSort implements iOrdenamiento{

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
        if (lista.length>20 && lista.length<=50){
            for (int i=0;i<lista.length-1;i++){
                for (int j=0;j<lista.length-i-1;j++){
                    if (lista[j].getEdad()>lista[j+1].getEdad()){
                        Persona temporal=lista[j];
                        lista[j]=lista[j+1];
                        lista[j+1]=temporal;
                    }
                }
            }
            System.out.println("----Lista ordenada con bubbleSort----");
            for (int k=0;k<lista.length;k++){
                lista[k].showInfo();
            }
        } else {
            this.next.realizarOrdenamiento(lista);
        }

    }


}
