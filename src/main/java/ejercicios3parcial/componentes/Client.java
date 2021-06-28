package ejercicios3parcial.componentes;

public class Client {
    public static void main(String[]args){
        Celular celular= new Celular("Samsung","Galaxy S10","9.0",5);
        Computadora computadora= new Computadora("Asus","Vivobook Pro N705","Windows 10 Home",8);
        Televisor televisor= new Televisor("Sony","Bravia XR","OLED",55);
        Mantenimiento mantenimiento= new Mantenimiento();
        mantenimiento.recomendarMantenimiento(celular);
        mantenimiento.recomendarMantenimiento(televisor);
        mantenimiento.recomendarMantenimiento(computadora);
    }
}
