package command.ejemplo;


import java.util.ArrayList;
import java.util.List;

public class MakeBuild {
    private List<iOperacionBuild> commandList=new ArrayList<>();

    public MakeBuild(){}

    public void addCommand(iOperacionBuild concreteCommand){
        commandList.add(concreteCommand);
    }

    public void executeCommand(){
        for (iOperacionBuild command:commandList){
            command.execute();
        }
        commandList.clear();
    }
}
