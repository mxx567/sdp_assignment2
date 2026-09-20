package classes;

public class Truck extends Transport{
    @Override
    public void deliver(String object, String destination) {
        System.out.println("Delivering " + object + " to " + destination + " by land");
    }
}
