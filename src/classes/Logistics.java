package classes;

public abstract class Logistics {
    protected abstract Transport createTransport();

    public void planDelivery(String object, String destination){
        Transport transport = createTransport();
        transport.deliver(object, destination);
    }

}
