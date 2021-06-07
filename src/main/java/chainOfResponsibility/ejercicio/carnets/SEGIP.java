package chainOfResponsibility.ejercicio.carnets;

public class SEGIP implements iPersonalResposable{

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
        PersonalCarnetizacion personalCarnetizacion=new PersonalCarnetizacion();
        this.setNext(personalCarnetizacion);
        Notario notario=new Notario();
        personalCarnetizacion.setNext(notario);
        Cajero cajero=new Cajero();
        notario.setNext(cajero);
        AyudaAlCliente ayudaAlCliente=new AyudaAlCliente();
        cajero.setNext(ayudaAlCliente);
        this.next.realizarCarnetizacion(persona);
    }
}
