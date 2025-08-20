package checkbox;

import interfaces.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Our checkbox is a WindowsCheckbox");
    }
}
