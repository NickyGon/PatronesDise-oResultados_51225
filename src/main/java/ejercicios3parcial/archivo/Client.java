package ejercicios3parcial.archivo;

public class Client {
    public static void main(String[]args){
        ArchivoSimple archivoSimple= new ArchivoSimple("Comida","txt","Esto es un asalto");
        ArchivoSimple archivoSimple2= new ArchivoSimple("Comida","pdf","Esto es un asalto forzado");
        ArchivoSimple archivoSimple3= new ArchivoSimple("Frase","txt","Esto es Esparta");

        ArchivoSimple archivoSimple4= new ArchivoSimple("Archivo","java","private String accion");
        ArchivoSimple archivoSimple5= new ArchivoSimple("gitignore","txt","Uninstall");
        ArchivoSimple archivoSimple6= new ArchivoSimple("Frase","txt","España y Brasil");

        CompositeArchivos folder1= new CompositeArchivos("Folder1");
        folder1.addArchivo(archivoSimple);
        folder1.addArchivo(archivoSimple2);
        folder1.addArchivo(archivoSimple3);

        CompositeArchivos folder2= new CompositeArchivos("Folder2");
        folder2.addArchivo(archivoSimple4);
        folder2.addArchivo(archivoSimple5);
        folder2.addArchivo(archivoSimple6);


        CompositeArchivos disk1= new CompositeArchivos("D:");
        disk1.addArchivo(folder1);
        disk1.addArchivo(folder2);

        CompositeArchivos disk2= new CompositeArchivos("E:");
        disk2.addArchivo(folder1);
        disk2.addArchivo(folder2);


        folder1.operation();
        folder1.showTotal();

        folder2.operation();
        folder2.showTotal();

        disk1.operation();
        disk1.showTotal();

        disk2.operation();
        disk2.showTotal();


    }
}
