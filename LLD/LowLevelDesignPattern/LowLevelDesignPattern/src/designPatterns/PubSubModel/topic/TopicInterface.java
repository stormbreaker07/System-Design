package designPatterns.PubSubModel.topic;

import designPatterns.PubSubModel.subscriber.SubscriberInterface;

public interface TopicInterface {

    void addSubscriber(SubscriberInterface subscriber);
    void removeSubscriber(String subscriberName);
    void notifyAllSubscriber(String message);
}
