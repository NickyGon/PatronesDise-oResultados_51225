package ejercicios.Iterator;

import java.util.Stack;

public class IteratorStackList implements Iterator{
    private Stack<Empleado> nombres;
    private int position;

    public IteratorStackList(Stack<Empleado> nombres) {
        this.nombres=nombres;
        position=0;
    }

    @Override
    public Object next() {
        return nombres.get(position++).getNombre();
    }

    @Override
    public boolean hasNext() {
        return this.nombres.size()!=0 && position<this.nombres.size();
    }
}
