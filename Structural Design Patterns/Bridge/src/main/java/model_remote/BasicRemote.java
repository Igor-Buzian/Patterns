package model_remote;

import interfases.Device;
import interfases.Remote;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        device.disable();
        System.out.println("Device is disabled");
    }

    @Override
    public void volumeDown() {
        System.out.println("(volumeDown) Volume was: "+device.getVolume());
        device.setVolume(device.getVolume()-10);
        System.out.println("(volumeDown) Volume now: "+device.getVolume());
    }

    @Override
    public void volumeUp() {
        System.out.println("(volumeUp) Volume was: "+device.getVolume());
        device.setVolume(device.getVolume()+10);
        System.out.println("(volumeUp) Volume now: "+device.getVolume());
    }

    @Override
    public void channelDown() {
        System.out.println("(channelDown) Chanel was: "+device.getVolume());
        device.setChannel(device.getChannel()-1);
        System.out.println("(channelDown)  Chanel now: "+device.getVolume());
    }

    @Override
    public void channelUp() {
        System.out.println("(channelDown) Chanel was: "+device.getVolume());
        device.setChannel(device.getChannel()+1);
        System.out.println("(channelDown)  Chanel now: "+device.getVolume());
    }
}
