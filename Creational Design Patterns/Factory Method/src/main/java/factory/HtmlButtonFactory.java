package factory;

import button.HtmlButton;
import interfaces.Button;

public class HtmlButtonFactory extends ButtonFactory {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
