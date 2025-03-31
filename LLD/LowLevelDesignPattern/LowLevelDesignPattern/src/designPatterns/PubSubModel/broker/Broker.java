package designPatterns.PubSubModel.broker;

import designPatterns.PubSubModel.subscriber.SubscriberInterface;
import designPatterns.PubSubModel.topic.BasicTopic;
import designPatterns.PubSubModel.topic.TopicInterface;

import java.util.HashMap;
import java.util.Map;

public class Broker {

    private final Map<String, TopicInterface> topics = new HashMap<>();

    public void addTopics(String topicName) {
        this.topics.put(topicName, new BasicTopic());
    }

    public void addTopics(String topicName, TopicInterface topic) {
        this.topics.put(topicName, topic);
    }

    public void subscribe(String topicName, SubscriberInterface subscriber) {
        if(this.topics.containsKey(topicName))
            this.topics.get(topicName).addSubscriber(subscriber);
    }

    public void publish(String topicName, String message) {
        if(this.topics.containsKey(topicName))
            this.topics.get(topicName).notifyAllSubscriber(message);
    }

}
