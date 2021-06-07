package chainOfResponsibility.ejercicio.ordenamientoPersonas;

public class Ordenador implements iOrdenamiento{

    private iOrdenamiento next;
    @Override
    public void setNext(iOrdenamiento handler) {
        this.next=handler;
    }

    @Override
    public iOrdenamiento goNext() {
        return this.next;
    }

    @Override
    public void realizarOrdenamiento(Persona[] lista) {
        InsertionSort insertionSort=new InsertionSort();
        this.setNext(insertionSort);
        BubbleSort bubbleSort= new BubbleSort();
        insertionSort.setNext(bubbleSort);
        SelectionSort selectionSort=new SelectionSort();
        bubbleSort.setNext(selectionSort);
        this.next.realizarOrdenamiento(lista);

    }
}
