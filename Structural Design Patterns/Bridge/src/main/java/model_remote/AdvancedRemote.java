package model_remote;

import interfases.Device;

public class AdvancedRemote extends  BasicRemote{

    public AdvancedRemote(Device device) {
        super(device);
        super.device = device;
    }

    public void mute(){
        System.out.println("Sound is muted");
        device.setVolume(0);
    }
}
