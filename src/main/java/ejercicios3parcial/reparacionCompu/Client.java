package ejercicios3parcial.reparacionCompu;


public class Client {
    //fusión de singleton (pagos en cuenta única al mismo tiempo), observer (notificaciones) y visitor
    //(kits segun cada computadora (no especifican la posibilidad de nuevas compus))
    public static void main (String[]args){
        AccesoACuenta accesoACuenta1= new AccesoACuenta();
        iComputadora computadora= new Laptop("Asus","Vivobook",false, Laptop.tamanoLaptop.PORTATIL);
        accesoACuenta1.realizarReparacion(computadora);
        iComputadora computadora2= new Tablet("Samsung","GalaxyTab","Android", Tablet.tamanoTablet.XL);
        accesoACuenta1.realizarReparacion(computadora2);
        iComputadora computadora3= new PC("HP","Ultra 10",true, PC.tamanoPC.MID);
        accesoACuenta1.realizarReparacion(computadora3);

        //AL no especificar que las reparaciones son al mismo tiempo, sino los pagos, estos u´tlimos son los únicos que
        // utilizan threads

        Thread Jose=new Thread(new Runnable() {
            @Override
            public void run() {
                accesoACuenta1.realizarPago(10000,computadora);
            }
        });

        Thread Maria=new Thread(new Runnable() {
            @Override
            public void run() {
                accesoACuenta1.realizarPago(10000,computadora2);
            }
        });

        Thread Marcelo=new Thread(new Runnable() {
            @Override
            public void run() {
                accesoACuenta1.realizarPago(10000,computadora3);
            }
        });

        Jose.start();
        Maria.start();
        Marcelo.start();
    }
}
