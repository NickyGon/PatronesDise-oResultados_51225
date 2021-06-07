package chainOfResponsibility.ejercicio.carnets;


public class AyudaAlCliente implements iPersonalResposable {

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
        if ((!persona.isCertificadoDeNacimiento())&&persona.getPagoAlBanco()==0 && persona.getFicha()>0){
            System.out.println("Estimado cliente, para el proceso de carnetización se requiere su certificado de nacimiento y el pago al banco.");
            System.out.println("Regrese cuando tenga estos requisitos cumplidos y saque otra ficha. Gracias");
        } else {
            System.out.println("Estimado cliente, no lo podemos atender sin ficha obtenida y/o los requisitos necesarios");
            System.out.println("Obtenga una ficha y/o los requisitos faltantes para el proceso de carnetización. Gracias");
        }
    }
}
