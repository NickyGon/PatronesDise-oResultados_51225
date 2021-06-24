package composite.basic;

public class Leaf extends Component{
    public Leaf(String attribute1, int attribute2) {
        super(attribute1, attribute2);
    }

    @Override
    public void operation() {
        //logica
        System.out.println("Leaf: "+this.getAttribute1()+" "+this.getAttribute2());
    }

    @Override
    public void add(Component component) {
        System.out.println("metodo (agregar comoponentes) no permitido en leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("metodo (remover comoponentes) no permitido en leaf");
    }

    @Override
    public void getChild(int position) {
        System.out.println("metodo (obtener comoponentes) no permitido en leaf");
    }
}
