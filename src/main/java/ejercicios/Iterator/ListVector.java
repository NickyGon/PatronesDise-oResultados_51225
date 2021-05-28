package ejercicios.Iterator;

import java.util.Vector;

public class ListVector implements iList{

    private Vector<Empleado> nombres;

    public ListVector(){nombres=new Vector<>();}

    public void add(Empleado value){
        nombres.add(value);
    }

    @Override
    public Iterator iterator() {
        return new IteratorVectorList(this.nombres);
    }
}
