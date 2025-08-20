package factory;

import interfaces.Button;
import interfaces.Checkbox;

public abstract class GUIFactory {
   public abstract Button createButton();
   public abstract  Checkbox createCheckbox();
}
