package classes;


public class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }

    public CheckBox createCheckbox() {
        return new MacOSCheckBox();
    }
}