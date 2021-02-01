package behavioral.iteratorPattern.iteratorExample3;

import behavioral.iteratorPattern.iteratorExample3.iterator.Iterator;
import behavioral.iteratorPattern.iteratorExample3.notification.Notification;
import behavioral.iteratorPattern.iteratorExample3.notification.NotificationCollection;

public class NotificationBar {

    NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications){
        this.notifications = notifications;
    }

    public void printNotifications(){
        Iterator iterator = notifications.createIterator();
        System.out.println("------- NOTIFICATION BAR -------");
        while (iterator.hasNext()){
            Notification notification = (Notification) iterator.next();
            System.out.println(notification.getNotification());
        }
    }
}
