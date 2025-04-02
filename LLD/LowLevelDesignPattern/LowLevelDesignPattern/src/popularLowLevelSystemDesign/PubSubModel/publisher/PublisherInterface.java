package popularLowLevelSystemDesign.PubSubModel.publisher;

public interface PublisherInterface {

    String getPublisherId();
    String getPublisherName();
    void publishMessage(String topicName, String message);
}
