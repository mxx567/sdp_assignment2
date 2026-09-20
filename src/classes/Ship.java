package classes;

public class Ship extends Transport{
    @Override
    public void deliver() {
        System.out.print("delivering by sea...");
    }
}
