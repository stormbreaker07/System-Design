package designPatterns.creational.factory.model;

public class NotificationInfo {

    private String notificationProvider;
    private String sender;
    private String message;
    private String category;

    public NotificationInfo(String notificationProvider, String sender, String message, String category) {
        this.notificationProvider = notificationProvider;
        this.sender = sender;
        this.message = message;
        this.category = category;
    }

    public String getNotificationProvider() {
        return notificationProvider;
    }

    public void setNotificationProvider(String notificationProvider) {
        this.notificationProvider = notificationProvider;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
