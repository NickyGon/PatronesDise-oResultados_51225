package ejercicios3parcial.archivo;



public abstract class Archivo {
    private String nombreCar;
    private String nombre;
    private String extension;
    private String cuerpo;
    private int numeroPalabras=0;

    public Archivo(String nombreCar) {
        this.nombreCar = nombreCar;
    }

    public Archivo(String nombre, String extension, String cuerpo) {
        this.nombre = nombre;
        this.extension = extension;
        this.cuerpo = cuerpo;
    }

    public void cuentaPalabras(){
        numeroPalabras=0;
        String input=this.cuerpo;
        for (String s:input.split(" ")) {
            this.numeroPalabras++;
        }
        System.out.println("Numero de palabras del archivo: "+this.numeroPalabras);
    }

    public void info(){
        System.out.println(nombre+"."+extension+": ");
        System.out.println(cuerpo);
        cuentaPalabras();
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getNombreCar() {
        return nombreCar;
    }

    public void setNombreCar(String nombreCar) {
        this.nombreCar = nombreCar;
    }

    public int getNumeroPalabras() {
        return numeroPalabras;
    }

    public void setNumeroPalabras(int numeroPalabras) {
        this.numeroPalabras = numeroPalabras;
    }

    public abstract void operation();
    public abstract void addArchivo(Archivo archivo);
    public abstract void remove(Archivo archivo);
    public abstract void getChild(int position);
}
