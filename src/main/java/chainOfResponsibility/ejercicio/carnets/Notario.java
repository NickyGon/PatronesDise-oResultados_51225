package chainOfResponsibility.ejercicio.carnets;


import java.text.SimpleDateFormat;

public class Notario implements iPersonalResposable {

    private iPersonalResposable next;

    @Override
    public void setNext(iPersonalResposable personal) {
        this.next=personal;
    }

    @Override
    public iPersonalResposable goNext() {
        return this.next;
    }

    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public void realizarCarnetizacion(PersonaRequisitos persona) {
        if ((!persona.isCertificadoDeNacimiento())&&persona.getPagoAlBanco()!=0&&persona.getFicha()>0){
            System.out.println("*****Obteniendo Certificado de Nacimiento*****");
            System.out.println("Certificado de nacimiento a nombre de: "+persona.getNombre());
            System.out.println("Fecha de nacimiento: "+ formato.format(persona.getFechaDeNacimiento()));

            System.out.println("****Atendiendo el Personal de Carnetización*****");
            System.out.println("---Carnetización realizada---");
            System.out.println( "Nuevo CI: "+(11110000+(int)(Math.random()*((11119999-11110000)+1))));
            persona.showPersonalInfo();
        } else {
            this.next.realizarCarnetizacion(persona);
        }
    }
}
