package behavioral.iteratorPattern.iteratorExample2;

import behavioral.iteratorPattern.iteratorExample2.database.Iterator;
import behavioral.iteratorPattern.iteratorExample2.database.UserNameDB;

public class Run {
    public static void main(String[] args) {
        UserNameDB userNameDB = new UserNameDB();

        for(Iterator it = userNameDB.getIterator(); it.hasNext();){
            String name = (String) it.next();
            System.out.println("Name: " + name);
        }
    }
}
