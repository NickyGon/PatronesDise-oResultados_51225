package singleton.ejemplos.logger;

import javax.print.Doc;

public class Cliente {
    public static void main(String[]args){
        Director director1= new Director();
        director1.setNombre("Jose");
        director1.setGradoAcademico("Doctor");

        Director director2=new Director();
        director2.setNombre("María");
        director2.setGradoAcademico("Master");

        Docente docente1=new Docente();
        docente1.setCategoría("Inicial");
        docente1.setNombre("Pedro");
        docente1.setMateria("Ing Soft");

        Estudiante estudiante1= new Estudiante();
        estudiante1.setNombre("Juan");
        estudiante1.setCarrera("Derecho");
        estudiante1.setSemestre("9");

        estudiante1.getCarrera();
        estudiante1.getSemestre();
        docente1.getMateria();

    }
}
