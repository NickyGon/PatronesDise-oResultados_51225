package prototype.examples.boletosFutbol;

public class Cliente {
    public static void main(String[]args){
        EntradaFisica e1=new EntradaFisica();
        e1.setPrecio("0");
        e1.setNumeroAsiento("0");
        e1.setNit("123456789");
        e1.setLugar("La Paz- Bolivia");
        e1.setFecha("19/02/2021");
        e1.setFactura("0");
        e1.setEquipoVisitante("Brasil");
        e1.setEquipoLocal("Bolivia");
        e1.setCategoria("");
        e1.setPersona(new Persona("",""));

        EntradaFisica eo=(EntradaFisica) e1.clone();
        eo.setPersona(new Persona("123","Jose"));
        eo.setCategoria("Preferencia");
        eo.setPrecio("100");
        eo.setFactura("111");
        eo.setNumeroAsiento("21");

        EntradaFisica eo2=(EntradaFisica) e1.clone();
        eo2.setPersona(new Persona("345","María"));
        eo2.setCategoria("Preferencia");
        eo2.setPrecio("100");
        eo2.setFactura("112");
        eo2.setNumeroAsiento("22");

        EntradaFisica eo3=(EntradaFisica) e1.clone();
        eo3.setPersona(new Persona("674","Marco"));
        eo3.setCategoria("Preferencia");
        eo3.setPrecio("100");
        eo3.setFactura("113");
        eo3.setNumeroAsiento("23");

        eo.showInfo();
        eo2.showInfo();
        eo3.showInfo();
    }
}
