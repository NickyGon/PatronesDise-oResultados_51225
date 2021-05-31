package ejercicios.IteratorOficial;


import java.util.Vector;

public class IteratorAvantica implements Iterator {
    private Vector<Empleado> nombres;
    private int position;
    public IteratorAvantica(Vector<Empleado> nombres){
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
