package commands;

import interfases.ICommand;
import light.Light;

public class TurnOffLightCommand implements ICommand {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightIsOff();
    }

    @Override
    public void undo() {
        light.lightIsOn();
    }
}
