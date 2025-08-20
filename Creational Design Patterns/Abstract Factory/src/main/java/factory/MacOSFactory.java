package factory;

import button.MacOSButton;
import checkbox.MacOSCheckbox;
import interfaces.Button;
import interfaces.Checkbox;

public class MacOSFactory extends GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
