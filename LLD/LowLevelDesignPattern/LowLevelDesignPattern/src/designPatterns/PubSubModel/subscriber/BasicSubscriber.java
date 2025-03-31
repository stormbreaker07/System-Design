package designPatterns.PubSubModel.subscriber;

public class BasicSubscriber implements SubscriberInterface{

    private final String subscriberName;
    private final String subscriberId;

    public BasicSubscriber(String subscriberName, String subscriberId) {
        this.subscriberName = subscriberName;
        this.subscriberId = subscriberId;
    }

    @Override
    public String getSubscriberId() {
        return this.subscriberId;
    }

    @Override
    public String getSubscriberName() {
        return this.subscriberName;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(subscriberName + " just received the message " + message + " from publisher");
    }
}
