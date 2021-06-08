package command.ejemplo;

public class RunTest implements iOperacionBuild{

    private IntelliJ ide;

    public RunTest(IntelliJ ide){
        this.ide=ide;
    }


    @Override
    public void execute() {
        System.out.println("running test...");
        this.ide.runUnitTests();
    }
}
