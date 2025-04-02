package popularLowLevelSystemDesign.PubSubModel.subscriber;

public interface SubscriberInterface {

    String getSubscriberId();
    String getSubscriberName();
    void receiveMessage(String message);
}
