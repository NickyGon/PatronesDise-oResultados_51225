package chainOfResponsibility.ejercicio.carnets;


public class Cajero implements iPersonalResposable {

    private iPersonalResposable next;

    @Override
    public void setNext(iPersonalResposable personal) {
        this.next=personal;
    }

    @Override
    public iPersonalResposable goNext() {
        return this.next;
    }

    @Override
    public void realizarCarnetizacion(PersonaRequisitos persona) {
        if (persona.isCertificadoDeNacimiento()&&persona.getPagoAlBanco()==0&&persona.getFicha()>0){
            System.out.println("*****Realizando pago al banco*****");
            System.out.println("Pago al banco a nombre de: "+persona.getNombre());
            persona.setPagoAlBanco(100);
            System.out.println("Monto pagado: "+ persona.getPagoAlBanco()+"Bs.");

            System.out.println("****Atendiendo el Personal de Carnetización*****");
            System.out.println("---Carnetización realizada---");
            System.out.println( "Nuevo CI: "+(11110000+(int)(Math.random()*((11119999-11110000)+1))));
            persona.showPersonalInfo();
        } else {
            this.next.realizarCarnetizacion(persona);
        }
    }
}
