public class User {

    // TODO Create Method to Register User and Display User's Name and Phone Number
    // and success message
    private String name;
    private String phoneNumber;

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        System.out.println("Registration sucessful!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void displayUser() {
        System.out.println("Name            : " + this.getName());
        System.out.println("Phone number    : " + this.getPhoneNumber());
    }

}
