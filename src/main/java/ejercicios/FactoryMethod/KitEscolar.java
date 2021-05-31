package ejercicios.FactoryMethod;


public class KitEscolar implements iKit{
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuadernos cuaderno;
    public KitEscolar(){
        this.mochila=mochila;
        this.deportivo=deportivo;
        this.cuaderno=cuaderno;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuadernos getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuadernos cuaderno) {
        this.cuaderno = cuaderno;
    }

    @Override
    public void crear() {
        System.out.println("---Kit Escolar---");
        mochila.showData();
        deportivo.showData();
        cuaderno.showData();
    }
}
