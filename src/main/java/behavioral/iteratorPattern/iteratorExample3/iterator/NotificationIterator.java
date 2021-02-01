package behavioral.iteratorPattern.iteratorExample3.iterator;

import behavioral.iteratorPattern.iteratorExample3.notification.Notification;

public class NotificationIterator implements Iterator {

    Notification[] notificationList;

    int currentPosition = 0;

    public NotificationIterator(Notification[] notificationList){
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        if(currentPosition >= notificationList.length || notificationList[currentPosition] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        // return next element in the array and increment pos
        Notification notification =  notificationList[currentPosition];
        currentPosition += 1;
        return notification;
    }
}
