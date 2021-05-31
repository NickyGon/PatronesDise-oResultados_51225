package ejercicios.Iterator;

import java.util.Vector;

public class IteratorVectorList implements Iterator {
    private Vector<Empleado> nombres;
    private int position;
    public IteratorVectorList(Vector<Empleado> nombres){
        this.nombres=nombres;
        this.position=0;
    }

    @Override
    public Object next() {
        return this.nombres.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.nombres.size()!=0 && position<this.nombres.size();
    }
}
