package ejercicios3parcial.reparacionCompu;

public class KitReparacion implements iReparacion{

    @Override
    public void llevarkit(Laptop laptop) {
        System.out.println("++++++++++++++");
        System.out.println("Reparando una Laptop");
        laptop.getInfo();
        laptop.obtainPrecio();
        System.out.println("++++++++++++++");
    }

    @Override
    public void llevarkit(Tablet tablet) {
        System.out.println("++++++++++++++");
        System.out.println("Reparando una Tablet ");
        tablet.getInfo();
        tablet.obtainPrecio();
        System.out.println("++++++++++++++");
    }

    @Override
    public void llevarkit(PC pc) {
        System.out.println("++++++++++++++");
        System.out.println("Reparando una PC ");
        pc.getInfo();
        pc.obtainPrecio();
        System.out.println("++++++++++++++");
    }
}
