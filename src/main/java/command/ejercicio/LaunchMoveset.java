package command.ejercicio;



import java.util.ArrayList;
import java.util.List;

public class LaunchMoveset {
    private List<iComandosJuego> listaComandos =new ArrayList<>();

    public LaunchMoveset(){}

    public void ingresaComando(iComandosJuego comandoConcretoJuego){
        listaComandos.add(comandoConcretoJuego);
    }

    public void ejecutarElMoveset(){
        for (iComandosJuego comando:listaComandos){
            comando.execute();
        }
        listaComandos.clear();
    }


}
