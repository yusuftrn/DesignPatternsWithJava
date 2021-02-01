package behavioral.iteratorPattern.iteratorExample3.notification;

import behavioral.iteratorPattern.iteratorExample3.iterator.Iterator;
import behavioral.iteratorPattern.iteratorExample3.iterator.NotificationIterator;

public class NotificationCollection implements Collection {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notificationList;

    public NotificationCollection(){
        notificationList = new Notification[MAX_ITEMS];

        addItem("Notification 1: Whatsapp Message");
        addItem("Notification 2: Facebook Message");
        addItem("Notification 3: Facebook Like notification");

    }

    public void addItem(String str){
        Notification notification = new Notification(str);
        if(numberOfItems >= MAX_ITEMS){
            System.err.println("LIST is FULL");
        }
        else{
            notificationList[numberOfItems] = notification;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
