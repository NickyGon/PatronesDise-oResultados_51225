package command.basic;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<iCommand> commandList=new ArrayList<>();

    public Invoker(){}

    public void addCommand(iCommand concreteCommand){
        commandList.add(concreteCommand);
    }

    public void executeCommand(){
        for (iCommand command:commandList){
            command.execute();
        }
        commandList.clear();
    }
}
