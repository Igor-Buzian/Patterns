package checkbox;

import interfaces.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Our checkbox is a MacOSCheckbox");
    }
}
