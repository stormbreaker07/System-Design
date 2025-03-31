package designPatterns.PubSubModel.publisher;

import designPatterns.PubSubModel.broker.Broker;

public class BasicPublisher implements PublisherInterface{

    private final String publisherName;
    private final String publisherId;
    private final Broker broker;

    public BasicPublisher(String publisherName, String publisherId, Broker broker) {
        this.publisherName = publisherName;
        this.publisherId = publisherId;
        this.broker = broker;
    }

    @Override
    public String getPublisherId() {
        return this.publisherId;
    }

    @Override
    public String getPublisherName() {
        return this.publisherName;
    }

    @Override
    public void publishMessage(String topicName, String message) {
        broker.publish(topicName, message);
    }
}
