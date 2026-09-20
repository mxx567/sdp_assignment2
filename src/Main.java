import classes.*;

void main() {
    while (true){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the delivery mode (ROAD/SEA): ");
        String delivery = scanner.nextLine().trim().toUpperCase();
        Logistics logistics;
        switch (delivery){
            case ("ROAD"):
                logistics = new RoadLogistics();
                break;
            case ("SEA"):
                logistics = new SeaLogistics();
                break;
            default: {
                System.out.println("Unknown logistics type. Please try again");
                continue;
            }
        }
        System.out.print("Select the UI platform (WINDOWS/MACOS): ");
        String platform = scanner.nextLine().trim().toUpperCase();
        GUIFactory renderer;
        switch (platform){
            case ("WINDOWS"):
                renderer = new WindowsFactory();
                break;
            case ("MACOS"):
                renderer = new MacOSFactory();
                break;
            default:
                System.out.println("Unknown logistics type. Please try again");
                continue;
        }
        DeliveryApplication da = new DeliveryApplication(logistics, renderer);
        da.run();
        return;

    }
}