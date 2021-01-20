package creational.builderPattern.builderpattern2;

public class UserBuilder {
    private final String firstName;
    private final String lastName;
    private int age;
    private String phone;
    private String address;

    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }
    public UserBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }
    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }
    //Return the finally consrcuted User object
    public UserBuilder build() {
        UserBuilder user =  new UserBuilder(firstName, lastName);
        validateUserObject(user);
        return user;
    }
    private void validateUserObject(UserBuilder newUser) {
        System.out.println("\nUser data validated: " + newUser.firstName);
    }

    //All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "UserBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
