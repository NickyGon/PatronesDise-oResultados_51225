package visitor.ejemplo;

public class Client {
    public static void main(String[]args){
        Perro perro= new Perro();
        perro.setNombre("Firulais");
        Gato gato= new Gato();
        gato.setNombre("Nino");
        Caballo caballo= new Caballo();
        caballo.setEdad(3);


        VeterinarioEnfermedad1 VE1= new VeterinarioEnfermedad1();

        perro.accept(VE1);
        gato.accept(VE1);
        caballo.accept(VE1);

        VeterinarioEnfermedad2 VE2= new VeterinarioEnfermedad2();

        perro.accept(VE2);
        gato.accept(VE2);
        caballo.accept(VE2);
    }
}
