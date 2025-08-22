package controlles;



import interfases.ICommand;

import java.util.Stack;

public class SmartRemoteControl {
    private ICommand command;
    private Stack<ICommand> history = new Stack<>();

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void isPressed(){
        if(command!=null){
            command.execute();
            history.push(command);
        }
    }

    public void undo(){
        if(!history.isEmpty()){
            ICommand lastElement = history.pop();
            lastElement.undo();
            System.out.println("We press undo button");
        }
        else {
            System.out.println("Our history is empty!");
        }
    }


}
