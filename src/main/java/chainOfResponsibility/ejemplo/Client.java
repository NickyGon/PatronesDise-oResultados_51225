package chainOfResponsibility.ejemplo;



public class Client {
    public static void main(String[]args){
        BancoPrestamo bancoPrestamo=new BancoPrestamo();
        bancoPrestamo.realizarPrestamo(new Persona("1128373","Nico",20000));
        bancoPrestamo.realizarPrestamo(new Persona("1128373","Nico",70000));
        bancoPrestamo.realizarPrestamo(new Persona("1128373","Nico",120000));
        bancoPrestamo.realizarPrestamo(new Persona("1128373","Nico",230000));
    }
}
