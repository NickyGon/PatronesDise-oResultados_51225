package chainOfResponsibility.basic;

public class HandlerConcrete3 implements iHandler{

    private iHandler next;
    @Override
    public void setNext(iHandler handler) {
        this.next=handler;
    }

    @Override
    public iHandler goNext() {
        return this.next;
    }

    @Override
    public void criteriaHandler(int criterioDeSolucion) {
        if (criterioDeSolucion>=20 && criterioDeSolucion<30){
            //logica //algoritmos
            System.out.println("INFO> HandlerConcrete3 es el que resuelve el problema");
        } else {
            System.out.println("INFO> No se puede resolver");
        }

    }
}
