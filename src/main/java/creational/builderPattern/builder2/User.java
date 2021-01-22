package creational.builderPattern.builder2;

public class User {
    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    private User(UserBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getFirstName();
        this.age = builder.getAge();
        this.phone = builder.getPhone();
        this.address = builder.getAddress();
    }
}