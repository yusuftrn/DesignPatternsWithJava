package creational.builderPattern.builderpattern2;

public class Run {

    public static void main(String[] args){
        UserBuilder user1 = new UserBuilder("Lokesh", "Gupta");
        user1.age(30).phone("1234567").address("Fake address 1234").build();
        System.out.println(user1);

        UserBuilder user2 = new UserBuilder("Jack", "Reacher");
        user2.age(40).phone("5655").build();
        //no address
        System.out.println(user2);

        UserBuilder user3 = new UserBuilder("Super", "Man").build();
        //No age
        //No phone
        //no address
        System.out.println(user3);
    }
}
