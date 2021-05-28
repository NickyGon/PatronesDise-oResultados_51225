package ejercicios.Iterator;

public class IteratorArrayList implements Iterator{
    private Empleado [] nombres;
    private int position;

    public IteratorArrayList(Empleado[] nombres) {
        this.nombres=nombres;
    }

    @Override
    public Object next() {
        return nombres[position++].getNombre();
    }

    @Override
    public boolean hasNext() {
        return nombres.length!=0 && position<nombres.length;
    }
}
