package ejercicios3parcial.reparacionCompu;

public class UsuarioRegistrado implements iUsuario{
    private Persona persona;
    public enum Cargos{
        PRESIDENTE,VICEPRESIDENTE,CONTABILIDAD;
    }
    private Cargos cargoUsuario;

    public UsuarioRegistrado(Persona persona, Cargos cargoUsuario) {
        this.persona = persona;
        this.cargoUsuario = cargoUsuario;
    }

    @Override
    public void notify(String message) {
        System.out.println("---------------------");
        System.out.println("Notificación para "+cargoUsuario+" "+persona.getName()+"("+persona.getCi()+")");
        System.out.println(message);
        System.out.println("---------------------");
    }

    @Override
    public Cargos getCargo() {
        return this.cargoUsuario;
    }
}
