package bridge.ejercicio.tarea;

public class Client {
    public static void main(String[]args){

        iEnvioPaquete mar= new Mar();
        iEnvioPaquete tierra= new Tierra();
        iEnvioPaquete aire= new Aire();
        Paquete paquete1= new Paquete(100,"Castañas de caju","Juan Manuel Dóriga");
        Paquete paquete2= new Paquete(70,"Juguetes para perros raza bully","Juan Manuel Dóriga");
        Paquete paquete3= new Paquete(120,"Lapices de colores","Juan Manuel Dóriga");

        iEmpresas SA= new EmpresaSA("Alimentos Sanos",mar);
        SA.enviarPaquete(paquete1);

        iEmpresas SRL= new EmpresaSRL("Woof Pack",tierra);
        SRL.enviarPaquete(paquete2);

        iEmpresas SA1= new EmpresaSRL("Madepa",aire);
        SA1.enviarPaquete(paquete3);







    }
}
