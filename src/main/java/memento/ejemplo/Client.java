package memento.ejemplo;

public class Client {
    public static void main(String[]args){
        GitHub gitHub=new GitHub();
        Git git=new Git();

        Codigo codigo;
        codigo=new Codigo("Codigo 1",false);

        codigo=new Codigo("Codigo 2",true);
        git.setState(codigo);
        gitHub.createCommit("6R38D2",git.createVersion());

        codigo=new Codigo("Codigo 3",false);

        codigo=new Codigo("Codigo 4",false);

        codigo=new Codigo("Codigo 5",false);
        git.setState(codigo);
        gitHub.createCommit("6SH239", git.createVersion());

        codigo=new Codigo("Codigo 6",true);

        git.restoreFromMemento(gitHub.getMemento("6R38D2"));

    }
}
