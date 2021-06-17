package visitor.ejercicio.intercambio;

public interface iTurista {
    void cambiar(int monedas,iPaises.changeMode changeMode,Brasil brasil);
    void cambiar(int monedas,iPaises.changeMode changeMode,Argentina argentina);
    void cambiar(int monedas,iPaises.changeMode changeMode,Bolivia bolivia);
    void cambiar(int monedas,iPaises.changeMode changeMode,Italia italia);
}
