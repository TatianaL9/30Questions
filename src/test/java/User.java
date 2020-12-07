public class User {
    private String firstName;
    public String lastName;

    public String output() {
        return "hi  " + firstName + " " + lastName;

    }
    public String getFirstName() {
        return firstName.toUpperCase();
    }
    public String getLastName() {
        return lastName.toUpperCase();
    }
    public void setFirstName(String fn) {
        firstName = fn;
    }
    public void setLatsName(String ln) {
        lastName = ln;
    }

}
