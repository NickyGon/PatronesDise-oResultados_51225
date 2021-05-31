package ejercicios.IteratorOficial;



public class Jalasoft implements iList {
    private Empleado[] nombres;
    private int position;

    public Jalasoft(){
        position=0;
        nombres=new Empleado[3];
    }

    public void add(Empleado value){
        nombres[position]=value;
        position++;
    }


    @Override
    public Iterator iterator() {
        return new IteratorJalasoft(this.nombres);
    }
}
