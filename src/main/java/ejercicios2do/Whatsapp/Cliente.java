package ejercicios2do.Whatsapp;

public class Cliente {
    public static void main(String[]args){
        Whatsapp whatsapp= new Whatsapp();
        Persona p1=new Persona(whatsapp);
        p1.setNombre("Nino Cabrera");
        p1.setTelefono(75820849);
        p1.setEstado("Viviendo la vida");

        Persona p2=new Persona(whatsapp);
        p2.setNombre("Nelly Carrozi");
        p2.setTelefono(75820324);
        p2.setEstado("Estoy durmiendo");

        Persona p3=new Persona(whatsapp);
        p3.setNombre("Nelson Candel");
        p3.setTelefono(75820274);
        p3.setEstado("No molestar");

        Persona p4=new Persona(whatsapp);
        p4.setNombre("Susi");
        p4.setTelefono(72943853);
        p4.setEstado("Zzzzzzz");

        Persona p5=new Persona(whatsapp);
        p5.setNombre("Manuelito");
        p5.setTelefono(75823951);
        p5.setEstado("Feliz :) ");

        Persona p6=new Persona(whatsapp);
        p6.setNombre("Juan Manuel");
        p6.setTelefono(76101311);
        p6.setEstado("Ocupado");

        Persona p7=new Persona(whatsapp);
        p7.setNombre("Marco Diaz");
        p7.setTelefono(75800110);
        p7.setEstado("");

        Persona p8=new Persona(whatsapp);
        p8.setNombre("Rosa Selena");
        p8.setTelefono(75890221);
        p8.setEstado("No molestar");

        Persona p9=new Persona(whatsapp);
        p9.setNombre("Paulo Murcia");
        p9.setTelefono(78232020);
        p9.setEstado("---<3---");

        Persona p10=new Persona(whatsapp);
        p10.setNombre("Lucio Senador");
        p10.setTelefono(73825700);
        p10.setEstado("Viviendo la vida");

        whatsapp.addAlGrupo(p1);
        whatsapp.addAlGrupo(p2);
        whatsapp.addAlGrupo(p3);
        whatsapp.addAlGrupo(p4);
        whatsapp.addAlGrupo(p5);
        whatsapp.addAlGrupo(p6);
        whatsapp.addAlGrupo(p7);
        whatsapp.addAlGrupo(p8);
        whatsapp.addAlGrupo(p9);
        whatsapp.addAlGrupo(p10);

        p1.enviar("Veamos la película","Nelly Carrozi");
        p10.enviar("Hola chicos!","");
    }
}
