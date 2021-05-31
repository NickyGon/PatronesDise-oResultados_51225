package ejercicios.IteratorOficial;


public class IteratorJalasoft implements Iterator {
    private Empleado[] nombres;
    private int position;

    public IteratorJalasoft(Empleado[] nombres) {
        this.nombres=nombres;
    }

    @Override
    public Object next() {
        return nombres[position++];
    }

    @Override
    public boolean hasNext() {
        return nombres.length!=0 && position<nombres.length;
    }
}
