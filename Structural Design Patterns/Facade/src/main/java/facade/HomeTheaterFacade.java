package facade;

import devices.AirConditioner;
import devices.Light;
import devices.TV;

public class HomeTheaterFacade {
    private Light light;
    private AirConditioner conditioner;
    private TV tv;

    public HomeTheaterFacade(Light light, AirConditioner conditioner, TV tv) {
        this.light = light;
        this.conditioner = conditioner;
        this.tv = tv;
    }

    public void watchMovie()
    {
        System.out.println("Now we will watch movie");
        light.turnOff();
        tv.turnOn();
        conditioner.turnOn();
    }

    public void endWatchMovie()
    {
        System.out.println("Now we will end to watch movie");
        light.turnOn();
        tv.turnOff();
        conditioner.turnOff();
    }
}
