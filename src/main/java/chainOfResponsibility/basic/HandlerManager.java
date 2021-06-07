package chainOfResponsibility.basic;

public class HandlerManager implements iHandler{

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
        HandlerConcrete1 handlerConcrete1=new HandlerConcrete1();
        this.setNext(handlerConcrete1);
        HandlerConcrete2 handlerConcrete2=new HandlerConcrete2();
        handlerConcrete1.setNext(handlerConcrete2);
        HandlerConcrete3 handlerConcrete3=new HandlerConcrete3();
        handlerConcrete2.setNext(handlerConcrete3);

        this.next.criteriaHandler(criterioDeSolucion);
    }
}
