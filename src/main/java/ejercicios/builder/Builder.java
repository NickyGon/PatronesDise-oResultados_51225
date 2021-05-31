package ejercicios.builder;

public abstract class Builder {
    protected Parrillas parrillas;
    public Parrillas getParrillas(){return parrillas;}
    public void createParrilla(){parrillas=new Parrillas();}

    public abstract void buildTipoCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();
}
