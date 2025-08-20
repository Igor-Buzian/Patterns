package button;

import interfaces.Button;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("This is a MacOSButton!");
    }
}
