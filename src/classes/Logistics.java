package classes;

public abstract class Logistics {
    public abstract Transport createTransport();

    public void planDelivery(String object, String destination){
        Transport transport = createTransport();
        transport.deliver(object, destination);
    }

}
