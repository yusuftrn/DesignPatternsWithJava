package behavioral.mediatorPattern.mediatorExample3;

import behavioral.mediatorPattern.mediatorExample3.user.User;

public class Run {
    public static void main(String[] args) {
        User yusuf = new User("Yusuf");
        User mehmet = new User("Mehmet");

        yusuf.sendMessage("Hello world");
        mehmet.sendMessage("Hi there xD");
    }
}
