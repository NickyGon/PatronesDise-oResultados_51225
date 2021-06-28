package decorator.ejemplo;

public class PluginDeploy extends Plugin{
    private int precioPlugin;
    private boolean isOpenSource;


    public PluginDeploy(IDE ide, int precioPlugin, boolean isOpenSource) {
        super(ide);
        this.precioPlugin=precioPlugin;
        this.isOpenSource=isOpenSource;
    }

    @Override
    public void execute(){
        super.execute();
        System.out.println("---Agregando PluginDeploy---");
        int newPrecio= this.precioPlugin+super.getPrecio();
        System.out.println("Precio nuevo con plugin Deploy: "+newPrecio);

    }
}
