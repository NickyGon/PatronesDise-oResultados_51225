package chainOfResponsibility.ejercicio.carnets;


public class PersonalCarnetizacion implements iPersonalResposable {

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
        if (persona.isCertificadoDeNacimiento()&&persona.getPagoAlBanco()!=0&&persona.getFicha()>0){
            System.out.println("---Carnetización realizada---");
            System.out.println( "Nuevo CI: "+(11110000+(int)(Math.random()*((11119999-11110000)+1))));
            persona.showPersonalInfo();
        } else {
            this.next.realizarCarnetizacion(persona);
        }
    }
}
