package ejercicios.IteratorOficial;


import java.util.ArrayList;
import java.util.List;

public class Mojix implements iList {
    private List<Empleado> nombres;

    public Mojix(){nombres=new ArrayList<Empleado>(); }

    public void add(Empleado value){nombres.add(value);}


    @Override
    public Iterator iterator() {
        return new IteratorMojix(nombres);
    }
}
