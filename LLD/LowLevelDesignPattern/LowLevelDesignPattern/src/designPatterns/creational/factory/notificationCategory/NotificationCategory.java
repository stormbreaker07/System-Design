package designPatterns.creational.factory.notificationCategory;

public interface NotificationCategory {

    public void setNotificationSender(String sender);
    public void setMessage(String message);
    public String getNotificationSender();
    public String getMessage();
}
