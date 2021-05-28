package ejercicios.Iterator;

public class ListArr implements iList{
    private Empleado [] nombres;
    private int position;

    public ListArr(){
        position=0;
        nombres=new Empleado[5];
    }

    public void add(Empleado value){
        nombres[position]=value;
        position++;
    }


    @Override
    public Iterator iterator() {
        return new IteratorArrayList(this.nombres);
    }
}
