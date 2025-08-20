package factory;

import interfaces.Button;

public abstract class ButtonFactory {

    public void info(){
        Button button = createButton();
        button.render();
    }
    public abstract Button createButton();
}
