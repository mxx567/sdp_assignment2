import classes.*;
public class DeliveryApplication {
    private final Logistics logistics;
    private final GUIFactory guiFactory;

    public DeliveryApplication(Logistics logistics, GUIFactory guiFactory) {
        this.logistics = logistics;
        this.guiFactory = guiFactory;
    }

    public void run() {
        Button button = guiFactory.createButton();
        CheckBox checkbox = guiFactory.createCheckbox();
        logistics.planDelivery("Phone Motherboards", "United States Of America, California");
        button.render();
        checkbox.render();
        checkbox.render();
    }
}
