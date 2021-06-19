package adapter.ejercicios;

public class Celular implements iArtefactosA{

    private int tiempoDeVida;
    private int precio;
    private String modelo;
    private String marca;
    private int threadMultiply=15+(int)(Math.random()*((35-15)+1)); //segundos a esperar

    public Celular(int tiempoDeVida, int precio, String modelo, String marca) {
        this.tiempoDeVida = tiempoDeVida;
        this.precio = precio;
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getThreadMultiply() {
        return threadMultiply;
    }

    public void setThreadMultiply(int threadMultiply) {
        this.threadMultiply = threadMultiply;
    }

    @Override
    public void showPrecio(boolean comprar) {
        System.out.println("---Mostrando el precio---");
        info();
        System.out.println("Precio (del/de la)"+this.getClass().getSimpleName()+": "+ precio);
        if (comprar){
            System.out.println("Dirigiendose a Caja...");
        }
    }

    @Override
    public void showTiempoDeVida() {
        System.out.println("---Mostrando el tiempo de vida---");
        info();
        System.out.println("Tiempo de vida (del/de la)"+this.getClass().getSimpleName()+": "+tiempoDeVida+" horas");
        System.out.println("Para ver mas sobre el producto, realize la prueba del aparato...");
    }

    @Override
    public void info() {
        System.out.println("----Mostrando el aparato escogido----");
        System.out.println("Descripcion: "+this.getClass().getSimpleName()+" "+modelo+" "+marca);
    }

    @Override
    public void prender(){
        System.out.println("----Encendiendo el aparato...----");
        System.out.println("Prueba de "+this.getClass().getSimpleName()+" iniciada con "+(threadMultiply)+" segundos");
        try {
            Thread.sleep(threadMultiply*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Apagando aparato...");
        System.out.println("Gracias por probar este aparato. Si desea comprarlo, dirijase a Caja para más información");
    }

    @Override
    public void comprar(){
        System.out.println("-------Comprando el aparato-------");
        info();
        System.out.println("Tiempo de vida: "+tiempoDeVida);
        showPrecio(false);
        System.out.println("-------");
        System.out.println("La compra de su "+this.getClass().getSimpleName()+ " ha sido exitosa. Buen día");
    }



}
