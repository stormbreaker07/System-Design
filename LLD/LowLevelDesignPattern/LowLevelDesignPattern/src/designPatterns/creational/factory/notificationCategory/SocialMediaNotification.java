package designPatterns.creational.factory.notificationCategory;

public class SocialMediaNotification implements NotificationCategory{

    private String notificationSender;
    private String notificationMessage;
    public SocialMediaNotification(String sender, String message) {
        this.notificationSender = sender;
        this.notificationMessage = message;
    }

    @Override
    public void setNotificationSender(String sender) {
        this.notificationSender = sender;
    }

    @Override
    public void setMessage(String message) {
        this.notificationMessage = message;
    }

    @Override
    public String getNotificationSender() {
        return this.notificationSender;
    }

    @Override
    public String getMessage() {
        return this.notificationMessage;
    }
}
