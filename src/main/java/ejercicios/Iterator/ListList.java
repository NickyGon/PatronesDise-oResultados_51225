package ejercicios.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ListList implements iList{
    private List<Empleado> nombres;

    public ListList(){nombres=new ArrayList<Empleado>(); }

    public void add(Empleado value){nombres.add(value);}


    @Override
    public Iterator iterator() {
        return new IteratorListList(nombres);
    }
}
