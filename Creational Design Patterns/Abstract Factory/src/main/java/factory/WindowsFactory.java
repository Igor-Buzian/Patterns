package factory;

import button.WindowsButton;
import checkbox.WindowsCheckbox;
import interfaces.Button;
import interfaces.Checkbox;

public class WindowsFactory extends GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
