package classes;

public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }
}
