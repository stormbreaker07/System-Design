package popularLowLevelSystemDesign.PubSubModel.topic;

import popularLowLevelSystemDesign.PubSubModel.subscriber.SubscriberInterface;

public interface TopicInterface {

    void addSubscriber(SubscriberInterface subscriber);
    void removeSubscriber(String subscriberName);
    void notifyAllSubscriber(String message);
}
