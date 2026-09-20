import classes.*;

void main() {
    Logistics sea = new SeaLogistics();
    sea.planDelivery("Containers", "USA, Los Angeles");
    Logistics road = new RoadLogistics();
    road.planDelivery("Phones", "Kazakhstan, Astana");
}