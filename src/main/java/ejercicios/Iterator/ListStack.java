package ejercicios.Iterator;

import java.util.Stack;

public class ListStack implements iList{
    private Stack<Empleado> nombres;
    private int position;

    public ListStack(){
        position=0;
        nombres=new Stack<Empleado>();
    }

    public void add(Empleado value){
        nombres.add(position++,value);
    }


    @Override
    public Iterator iterator() {
        return new IteratorStackList(this.nombres);
    }
}
