package designPatterns.creational.factory.notificationCategory;

public class LoginInNotification implements NotificationCategory{
    private String notificationSender;
    private String notificationMessage;
    public LoginInNotification(String sender, String message) {
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
