package visitor.ejercicio.intercambio;

public interface iPaises {
    enum changeMode{
        DOLARMONEDA,MONEDADOLAR;
    }
    void accept(int monedas,iTurista turista,changeMode modo);
}
