package ejercicios.Iterator;

import java.util.List;

public class IteratorListList implements Iterator{
    private List<Empleado> nombres;
    private int position;

    public IteratorListList(List<Empleado> nombres) {
        this.nombres=nombres;
        this.position=0;
    }

    @Override
    public Object next() {
        return this.nombres.get(position++).getNombre();
    }

    @Override
    public boolean hasNext() {
        return this.nombres.size()!=0 && position<this.nombres.size();
    }
}
