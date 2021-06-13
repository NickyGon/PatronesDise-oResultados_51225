package ejercicios2do.GitHub;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Client {
    public static void main(String[]args){
        GitHub gitHub=new GitHub();
        Git git=new Git();

        gitHub.setNombreRepo("Repo");

        Calendar myCalendar = new GregorianCalendar(2021, 3, 29);
        Date myDate = myCalendar.getTime();

        Desarrollador desarrollador1=new Desarrollador(new Persona("Nicole Góngora","Java","NickyGon"),myDate);

        myCalendar = new GregorianCalendar(2021, 4, 18);
        myDate = myCalendar.getTime();

        Desarrollador desarrollador2=new Desarrollador(new Persona("Eric González","Python","ECartman"),myDate);

        myCalendar = new GregorianCalendar(2021, 4, 10);
        myDate = myCalendar.getTime();
        Desarrollador desarrollador3=new Desarrollador(new Persona("Guillermo Pradenas","Java","ElGuille"),myDate);

        gitHub.attach(desarrollador1);
        gitHub.attach(desarrollador2);
        gitHub.attach(desarrollador3);

        Codigo codigo;

        codigo=new Codigo("System.out.println('Hola mundo');","primer commit del ejercicio");
        git.setState(codigo);
        gitHub.createCommit("commit1",git.createVersion());

        codigo=new Codigo("String mensaje='Hola mundo'\nSystem.out.println(mensaje);","segundo commit del ejercicio, con asignación de valores");
        git.setState(codigo);
        gitHub.createCommit("commit2",git.createVersion());

        codigo=new Codigo("String mensaje='Hola mundo'\nint numeroVeces=3;\nfor(int i=0;i<numeroVeces;i++){\nSystem.out.println(mensaje);}","añadido de repetición de mensajes");
        git.setState(codigo);
        gitHub.createCommit("commit3",git.createVersion());

        codigo=new Codigo("String mensaje='Hola mundo'\nprivate int numeroVeces=0;\npublic void setNumeroVeces(int veces){this.numeroVeces=veces;}\nfor(int i=0;i<numeroVeces;i++)" +
                "{\nSystem.out.println(mensaje);}","un set para establecer cuantas veces queremos repetir el mensaje");
        git.setState(codigo);
        gitHub.createCommit("commit4",git.createVersion());

        codigo=new Codigo("String mensaje='Hola mundo'\nprivate int numeroVeces=0;\npublic void setNumeroVeces(int veces){this.numeroVeces=veces;}\n" +
                "if(numeroVeces<=0){\nfor(int i=0;i<numeroVeces;i++){\nSystem.out.println(mensaje);}\n}else{\nSystem.out.println('No se puede');}","Quinto commit, con una condición que no permite número negativos ni 0");
        git.setState(codigo);
        gitHub.createCommit("commit5", git.createVersion());

        git.restoreFromMemento(gitHub.getMemento("commit1"));

        gitHub.detach(desarrollador1);
        gitHub.detach(desarrollador2);
        gitHub.detach(desarrollador3);

        myCalendar = new GregorianCalendar(2021, 5, 21);
        myDate = myCalendar.getTime();

        Desarrollador desarrollador1a=new Desarrollador(new Persona("Esteban Marshall","C++","StanMarsh29"),myDate);

        myCalendar = new GregorianCalendar(2021, 5, 29);
        myDate = myCalendar.getTime();

        Desarrollador desarrollador2a=new Desarrollador(new Persona("Selena Flores","Python","Selenit4"),myDate);

        myCalendar = new GregorianCalendar(2021, 6, 1);
        myDate = myCalendar.getTime();
        Desarrollador desarrollador3a=new Desarrollador(new Persona("Nores Martinez","Java","DogoArgentino12"),myDate);

        gitHub.attach(desarrollador1a);
        gitHub.attach(desarrollador2a);
        gitHub.attach(desarrollador3a);

        git.restoreFromMemento(gitHub.getMemento("commit5"));
    }
}
