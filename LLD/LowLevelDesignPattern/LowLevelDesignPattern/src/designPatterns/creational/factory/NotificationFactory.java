package designPatterns.creational.factory;

import designPatterns.creational.factory.model.NotificationInfo;
import designPatterns.creational.factory.notification.MailNotification;
import designPatterns.creational.factory.notification.Notification;
import designPatterns.creational.factory.notification.PushNotification;
import designPatterns.creational.factory.notification.SmsNotification;

public class NotificationFactory {

    public static Notification createNotification(NotificationInfo notificationInfo) {

        if(notificationInfo.getNotificationProvider() == null) return null;

        return switch (notificationInfo.getNotificationProvider()) {
            case "mail" -> new MailNotification(notificationInfo);
            case "push" -> new PushNotification(notificationInfo);
            case "sms" -> new SmsNotification(notificationInfo);
            default -> null;
        };
    }
}
