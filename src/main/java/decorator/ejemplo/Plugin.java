package decorator.ejemplo;

public class Plugin implements IDE{
    private IDE ide;

    public Plugin(IDE ide) {
        this.ide = ide;
    }

    public IDE getIde() {
        return ide;
    }

    public void setIde(IDE ide) {
        this.ide = ide;
    }

    @Override
    public void execute() {
        this.ide.execute();
    }

    @Override
    public int getPrecio() {
        return 0;
    }

    @Override
    public void setPrecio(int precio) {

    }


}
