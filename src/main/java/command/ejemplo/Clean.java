package command.ejemplo;

public class Clean implements iOperacionBuild{

    private IntelliJ ide;

    public Clean(IntelliJ ide){
        this.ide=ide;
    }


    @Override
    public void execute() {
        System.out.println("running...");
        this.ide.cleanFolder();
    }
}
