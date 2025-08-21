package demo;

import devices.AirConditioner;
import devices.Light;
import devices.TV;
import facade.HomeTheaterFacade;

public class FacadeExample {
    public static void main(String[] args) {

        Light light = new Light();
        AirConditioner ac = new AirConditioner();
        TV tv = new TV();


        HomeTheaterFacade facade = new HomeTheaterFacade(light, ac, tv);

        System.out.println("--- Client wants to watch a movie ---");
        facade.watchMovie();

        System.out.println("\n--- Client finished watching ---");
        facade.endWatchMovie();
    }
}