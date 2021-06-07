package chainOfResponsibility.basic;

public class HandlerConcrete1 implements iHandler{

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
        if (criterioDeSolucion<10){
            //logica //algoritmos
            System.out.println("INFO> HandlerConcrete1 es el que resuelve el problema");
        } else {
            this.next.criteriaHandler(criterioDeSolucion);
        }

    }
}
