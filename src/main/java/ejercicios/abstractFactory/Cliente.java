package ejercicios.abstractFactory;

public class Cliente {
    public static void main(String[]args){
        Estudiante e1=new Estudiante("Nino",12,80,90);
        Estudiante e2=new Estudiante("Juan",15,88,93);
        Estudiante e3=new Estudiante("Peter",10,90,95);
        Estudiante e4=new Estudiante("Jack",18,95,80);
        Estudiante e5=new Estudiante("Rusell",17,78,85);


        Estudiante[] arr={e1,e2};
        Estudiante[] arr1={e3};
        Estudiante[] arr2={e4};
        Estudiante[] arr3={e5};
       Historia historia=(Historia) Inscripcion.inscribir(Inscripcion.Materia.HISTORIA);
       historia.setEstudiante(arr);
       historia.inscribir();

       Lenguaje lenguaje=(Lenguaje) Inscripcion.inscribir(Inscripcion.Materia.LENGUAJE);
       lenguaje.setEstudiante(arr1);
       lenguaje.inscribir();

       Ingles ingles=(Ingles) Inscripcion.inscribir(Inscripcion.Materia.INGLES);
       ingles.setEstudiante(arr2);
       ingles.inscribir();

       Matematicas matematicas=(Matematicas) Inscripcion.inscribir(Inscripcion.Materia.MATEMATICAS);
       matematicas.setEstudiante(arr3);
       matematicas.inscribir();

    }
}
