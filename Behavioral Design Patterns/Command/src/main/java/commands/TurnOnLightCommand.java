package commands;

import interfases.ICommand;
import light.Light;

public class TurnOnLightCommand implements ICommand {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightIsOn();
    }

    @Override
    public void undo() {
        light.lightIsOff();
    }
}
