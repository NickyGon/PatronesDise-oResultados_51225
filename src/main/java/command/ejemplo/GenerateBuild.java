package command.ejemplo;

public class GenerateBuild implements iOperacionBuild{

    private IntelliJ ide;

    public GenerateBuild(IntelliJ ide){
        this.ide=ide;
    }


    @Override
    public void execute() {
        System.out.println("building...");
        this.ide.createBuild();
    }
}
