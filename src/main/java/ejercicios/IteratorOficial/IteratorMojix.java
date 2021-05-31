package ejercicios.IteratorOficial;


import java.util.List;

public class IteratorMojix implements Iterator {
    private List<Empleado> nombres;
    private int position;

    public IteratorMojix(List<Empleado> nombres) {
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
