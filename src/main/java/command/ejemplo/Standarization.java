package command.ejemplo;

public class Standarization implements iOperacionBuild{

    private IntelliJ ide;

    public Standarization(IntelliJ ide){
        this.ide=ide;
    }


    @Override
    public void execute() {
        System.out.println("reviewing code...");
        this.ide.codeStandardReview();
    }
}
