package ejercicios.IteratorOficial;

import java.util.Vector;
public class Avantica implements iList {

    private Vector<Empleado> nombres;

    public Avantica(){nombres=new Vector<>();}

    public void add(Empleado value){
        nombres.add(value);
    }

    @Override
    public Iterator iterator() {
        return new IteratorAvantica(this.nombres);
    }
}
