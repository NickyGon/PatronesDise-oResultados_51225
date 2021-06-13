package ejercicios2do.GitHub;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Desarrollador implements iDesarrollador{

    //Concrete Observer
    private Persona persona;
    private Date cloneTime;

    public Desarrollador(Persona persona, Date cloneTime) {
        this.persona = persona;
        this.cloneTime = cloneTime;
    }
    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public void update(String message) {
        System.out.print(message);
        persona.info();
        System.out.println("(Repositorio clonado por ultima vez en "+formato.format(cloneTime)+")");

    }
}
