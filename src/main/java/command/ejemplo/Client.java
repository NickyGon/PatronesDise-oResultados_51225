package command.ejemplo;



public class Client {
    public static void main(String[]args){
        IntelliJ idea=new IntelliJ("2000",true);
        Clean clean=new Clean(idea);
        RunTest runTest=new RunTest(idea);
        Standarization standarization=new Standarization(idea);
        GenerateBuild generateBuild=new GenerateBuild(idea);
        MakeBuild makeBuild= new MakeBuild();

        makeBuild.addCommand(clean);
        makeBuild.addCommand(runTest);
        makeBuild.addCommand(standarization);
        makeBuild.addCommand(generateBuild);

        makeBuild.executeCommand();
    }
}
