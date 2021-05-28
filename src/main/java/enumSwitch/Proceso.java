package enumSwitch;

public class Proceso {
    //Se llama al enum
    DepartamentosBolivia dep;

    //Se crea un constructor de esta clase, tomando a un Departamento
    public Proceso(DepartamentosBolivia dep){
        this.dep=dep;
    }

    //Por departamento, se pone la info
    public String displayInfo(Proceso act){
        return DepartamentosBolivia.getInfo(act.dep);
    }


    public static void main (String[]args){
        //Iterar por cada constante de la lista, para ver sus estados
        for (DepartamentosBolivia d: DepartamentosBolivia.values()){
            //Se adquiere un nuevo departamento del constructor
            Proceso act = new Proceso(d);
            //Se muestra la info
            System.out.println(act.displayInfo(act));
        }
    }
}
