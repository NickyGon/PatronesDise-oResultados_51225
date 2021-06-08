package command.ejemplo;

public class IntelliJ {
    private String version="2021";
    private boolean isFreeVersion;

    public IntelliJ(String version, boolean isFreeVersion) {
        this.version=version;
        this.isFreeVersion=isFreeVersion;
    }

    public void showInfo(){
        System.out.println("Version: "+version);
        System.out.println("Free Version: "+isFreeVersion);
    }

    public void cleanFolder(){
        System.out.println("COMMAND>cleanFolder: ");
        this.showInfo();
    }

    public void runUnitTests(){
        System.out.println("COMMAND>runUnitTest: ");
        this.showInfo();
    }

    public void codeStandardReview(){
        System.out.println("COMMAND>codeStandardReview: ");
        this.showInfo();
    }

    public void createBuild(){
        System.out.println("COMMAND>createBuild: ");
        this.showInfo();
    }

}
