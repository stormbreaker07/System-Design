package designPatterns.creational.factory.notification;

import designPatterns.creational.factory.model.NotificationInfo;
import designPatterns.creational.factory.notificationCategory.NotificationCategory;

public interface Notification {

    public NotificationCategory createNotificationCategory(NotificationInfo info);
}
