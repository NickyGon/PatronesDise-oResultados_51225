package chainOfResponsibility.basic;

public class HandlerConcrete2 implements iHandler{

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
        if (criterioDeSolucion>=10 && criterioDeSolucion<20){
            //logica //algoritmos
            System.out.println("INFO> HandlerConcrete2 es el que resuelve el problema");
        } else {
            this.next.criteriaHandler(criterioDeSolucion);
        }

    }
}
