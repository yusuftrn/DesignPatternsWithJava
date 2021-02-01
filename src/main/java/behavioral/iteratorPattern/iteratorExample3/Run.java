package behavioral.iteratorPattern.iteratorExample3;

import behavioral.iteratorPattern.iteratorExample3.notification.NotificationCollection;

public class Run {
    public static void main(String[] args) {
        NotificationCollection notificationCollection = new NotificationCollection();
        NotificationBar notificationBar = new NotificationBar(notificationCollection);

        notificationBar.printNotifications();
    }
}
/*
------- NOTIFICATION BAR -------
Notification 1: Whatsapp Message
Notification 2: Facebook Message
Notification 3: Facebook Like notification
 */