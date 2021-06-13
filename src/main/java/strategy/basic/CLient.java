package strategy.basic;

public class CLient {
    public static void main(String[]args){
        Context context= new Context();
        context.setEstrategia(new ConcreteStrategy());
        context.execute();
        context.setEstrategia(new ConcreteStrategy2());
        context.execute();
        context.setEstrategia(new ConcreteStrategy3());
        context.execute();
    }
}
