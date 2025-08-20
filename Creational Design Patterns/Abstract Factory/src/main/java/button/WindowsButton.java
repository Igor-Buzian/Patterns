package button;

import interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("This is a WindowsButton!");
    }
}
