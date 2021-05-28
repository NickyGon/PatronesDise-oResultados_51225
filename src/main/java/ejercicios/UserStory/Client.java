package ejercicios.UserStory;

public class Client {
    public static void main(String[]args){
        String interpretar="Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        InterpreterUserStory in=new InterpreterUserStory(interpretar);
        String interpretado=in.interpretar();
        System.out.println("User story original: "+interpretar);
        System.out.println("User story traducido: "+interpretado);
    }
}
