package demo;

import commands.TurnOffLightCommand;
import commands.TurnOnLightCommand;
import controlles.SmartRemoteControl;
import light.Light;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        TurnOnLightCommand on = new TurnOnLightCommand(light);
        TurnOffLightCommand off = new TurnOffLightCommand(light);
        SmartRemoteControl smartRemoteControl = new SmartRemoteControl();
        smartRemoteControl.setCommand(on);
        smartRemoteControl.isPressed();
        System.out.println("------------------------------------------");
        smartRemoteControl.setCommand(off);
        smartRemoteControl.isPressed();
        System.out.println("------------------------------------------");
        smartRemoteControl.undo();
        System.out.println("------------------------------------------");
        smartRemoteControl.undo();
        System.out.println("------------------------------------------");
        smartRemoteControl.undo();
    }
}
