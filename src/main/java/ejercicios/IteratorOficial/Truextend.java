package ejercicios.IteratorOficial;

import java.util.Stack;

public class Truextend implements iList {
    private Stack<Empleado> nombres;
    private int position;

    public Truextend(){
        position=0;
        nombres=new Stack<Empleado>();
    }

    public void add(Empleado value){
        nombres.add(position++,value);
    }


    @Override
    public Iterator iterator() {
        return new IteratorTruextend(this.nombres);
    }
}
