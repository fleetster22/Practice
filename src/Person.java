public class Person {
    private short id;
    private String firstName;
    private String lastName;
    private String email;

    boolean validatedEmail = email.contains("@");

    public Person() {
    }

    public Person(short id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        this.lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        this.email = email;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    validate email

}
