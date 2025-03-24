package designPatterns.creational.factory.notification;

import designPatterns.creational.factory.model.NotificationInfo;
import designPatterns.creational.factory.notificationCategory.LoginInNotification;
import designPatterns.creational.factory.notificationCategory.NotificationCategory;
import designPatterns.creational.factory.notificationCategory.OtpNotification;
import designPatterns.creational.factory.notificationCategory.SocialMediaNotification;

public class PushNotification implements Notification{

    private final NotificationCategory notificationCategory;

    public PushNotification(NotificationInfo info) {
        notificationCategory = createNotificationCategory(info);
    }

    @Override
    public NotificationCategory createNotificationCategory(NotificationInfo info) {

        if(info.getCategory() == null) return null;

        return switch (info.getCategory()) {
            case "login" -> new LoginInNotification(info.getSender(), info.getMessage());
            case "otp" -> new OtpNotification(info.getSender(), info.getMessage());
            case "social" -> new SocialMediaNotification(info.getSender(), info.getMessage());
            default -> null;
        };

    }

    public NotificationCategory getNotificationCategory() {
        return notificationCategory;
    }
}
