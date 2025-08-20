package factory;

import button.WindowsButton;
import interfaces.Button;

public class WindowsButtonFactory extends ButtonFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
