package decorator.ejemplo;

public class PluginDebug extends Plugin{
    private int precioPlugin;
    private boolean isOpenSource;


    public PluginDebug(IDE ide, int precioPlugin, boolean isOpenSource) {
        super(ide);
        this.precioPlugin=precioPlugin;
        this.isOpenSource=isOpenSource;

    }

    @Override
    public void execute(){
        super.execute();
        System.out.println("---Agregando PluginDebug---");
        int newPrecio= this.precioPlugin+super.getPrecio();
        System.out.println("Precio nuevo con plugin Debug: "+newPrecio);

    }
}
