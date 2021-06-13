package strategy.basic;

public class ConcreteStrategy implements iEstrategia{

    @Override
    public void execute() {
        //algoritmo
        System.out.println("Strategy 1>Algoritmo 1");
    }
}
