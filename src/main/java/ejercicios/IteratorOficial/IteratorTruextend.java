package ejercicios.IteratorOficial;


import java.util.Stack;

public class IteratorTruextend implements Iterator {
    private Stack<Empleado> nombres;
    private int position;

    public IteratorTruextend(Stack<Empleado> nombres) {
        this.nombres=nombres;
        position=0;
    }

    @Override
    public Object next() {
        return nombres.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.nombres.size()!=0 && position<this.nombres.size();
    }
}
