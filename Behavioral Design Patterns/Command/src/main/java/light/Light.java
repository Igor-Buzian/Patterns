package light;

public class Light {
    private boolean on = false;

    public void lightIsOn() {
        if (!on) {
            System.out.println("Light is on!");
            on = true;
        } else {
            System.out.println("The light is already on");
        }
    }

    public void lightIsOff() {
        if (on) {
            System.out.println("Light is off!");
            on = false;
        } else {
            System.out.println("The light is already off");
        }
    }
}
