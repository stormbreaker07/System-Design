package designPatterns.PubSubModel.topic;

import designPatterns.PubSubModel.subscriber.SubscriberInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BasicTopic implements TopicInterface{

    List<SubscriberInterface> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(SubscriberInterface subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(String subscriberName) {
        Optional<SubscriberInterface> subscriber = subscribers.stream().filter(x ->
                x.getSubscriberName().equals(subscriberName)).findAny();
    }

    @Override
    public void notifyAllSubscriber(String message) {
        for(SubscriberInterface subscriber : subscribers)
            subscriber.receiveMessage(message);
    }
}
