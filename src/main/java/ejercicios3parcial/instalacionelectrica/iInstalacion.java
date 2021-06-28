package ejercicios3parcial.instalacionelectrica;

import java.util.Date;

public interface iInstalacion {
    void recibirPago(iFormaDePago formaDePago, Date date);
    int getSpent();
}
