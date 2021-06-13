package ejercicios2do.CuerpoDeEjercito;

public class CLiente {
    public static void main(String[]args){
        Cuartel cuartel= new Cuartel();
        Orden a=new Orden("calle 11 de Calacoto");
        a.setCategoria(Orden.Categoria.DESBLOQUEO);
        Orden b=new Orden("marcha de la COB");
        b.setCategoria(Orden.Categoria.MANIFESTACION);
        Orden c=new Orden("bloque de habitaciones");
        c.setCategoria(Orden.Categoria.LIMPIEZA);
        Orden d=new Orden("Maria Rene de Red Uno");
        d.setCategoria(Orden.Categoria.ENTREVISTAS);
        Orden e=new Orden("secundaria 2021");
        e.setCategoria(Orden.Categoria.DISCIPLINA);


        cuartel.realizarOrden(a);
        cuartel.realizarOrden(b);
        cuartel.realizarOrden(c);
        cuartel.realizarOrden(d);
        cuartel.realizarOrden(e);

    }
}
