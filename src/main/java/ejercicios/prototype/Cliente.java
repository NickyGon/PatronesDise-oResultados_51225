package ejercicios.prototype;

public class Cliente {
    public static void main(String[]args){
        ContratoDocente contrato=new ContratoDocente();
        contrato.setSueldo(5000);
        contrato.setCargaHoraria(80);
        contrato.setCursoEducacionSuperior(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMarcadoBiometrico(false);
        contrato.setMarcadoHoraEntrada("08:00");
        contrato.setMarcadoHoraSalida("18:00");

        ContratoDocente conclone1=(ContratoDocente) contrato.clone();
        conclone1.setNombre("Nicole");
        conclone1.setApellido("Gongora");

        ContratoDocente conclone2=(ContratoDocente) contrato.clone();
        conclone2.setNombre("Jason");
        conclone2.setApellido("Gomez");

        ContratoDocente conclone3=(ContratoDocente) contrato.clone();
        conclone3.setNombre("Maria");
        conclone3.setApellido("Juana");

        ContratoDocente conclone4=(ContratoDocente) contrato.clone();
        conclone4.setNombre("Nicolas");
        conclone4.setApellido("Gerardo");

        ContratoDocente conclone5=(ContratoDocente) contrato.clone();
        conclone5.setNombre("Mino");
        conclone5.setApellido("Gordo");

        ContratoDocente conclone6=(ContratoDocente) contrato.clone();
        conclone6.setNombre("Nadia");
        conclone6.setApellido("Guevara");

        ContratoDocente conclone7=(ContratoDocente) contrato.clone();
        conclone7.setNombre("Nelson");
        conclone7.setApellido("Riviera");

        ContratoDocente conclone8=(ContratoDocente) contrato.clone();
        conclone8.setNombre("Nacha");
        conclone8.setApellido("Guevara");

        ContratoDocente conclone9=(ContratoDocente) contrato.clone();
        conclone9.setNombre("Marcelo");
        conclone9.setApellido("Polino");

        ContratoDocente conclone10=(ContratoDocente) contrato.clone();
        conclone10.setNombre("Nelson");
        conclone10.setApellido("Riviera");

        ContratoDocente conclone11=(ContratoDocente) contrato.clone();
        conclone11.setNombre("Mirio");
        conclone11.setApellido("Raul");

        ContratoDocente conclone12=(ContratoDocente) contrato.clone();
        conclone12.setNombre("Marco");
        conclone12.setApellido("Costales");

        ContratoDocente conclone13=(ContratoDocente) contrato.clone();
        conclone13.setNombre("Cordelia");
        conclone13.setApellido("Riviera");

        ContratoDocente conclone14=(ContratoDocente) contrato.clone();
        conclone14.setNombre("Omar");
        conclone14.setApellido("Raul");

        ContratoDocente conclone15=(ContratoDocente) contrato.clone();
        conclone15.setNombre("Polino");
        conclone15.setApellido("Gongora");

        conclone1.showInfo();
        conclone2.showInfo();
        conclone3.showInfo();
        conclone4.showInfo();
        conclone5.showInfo();
        conclone6.showInfo();
        conclone7.showInfo();
        conclone8.showInfo();
        conclone9.showInfo();
        conclone10.showInfo();
        conclone11.showInfo();
        conclone12.showInfo();
        conclone13.showInfo();
        conclone14.showInfo();
        conclone15.showInfo();





    }
}
