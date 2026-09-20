package classes;

public class Ship extends Transport{
    @Override
    public void deliver(String object, String destination) {
        System.out.println("Delivering " + object + " to " + destination + " by sea");
    }
}
