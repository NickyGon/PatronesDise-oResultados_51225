package intepreter.ejercicios.RomanosUnTerminal;

public class Client {
    public static void main(String[]args) {
        String operacion = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15";
        InterpreterRomanos interpreterRomanos = new InterpreterRomanos(operacion);
        System.out.println("Operacion: " + operacion);
        System.out.println("Resultado: " + interpreterRomanos.interpretar());
    }
}
