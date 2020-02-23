package adt;

public class Person {
    // a field to store the first name
    // a field to store the last name
    // a list to store multiple contact numbers (i.e a list of numbers)
    // a field to store the email address of the person

    String firstName;
    String lastName;
    MyListADT<String> multipleContacts;
    String emailAddress;


    public Person(String firstName, String lastName, MyListADT<String> multipleContacts, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.multipleContacts = multipleContacts;
        this.emailAddress = emailAddress;
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

    public MyListADT<String> getMultipleContacts() {
        return multipleContacts;
    }

    public void setMultipleContacts(MyListADT<String> multipleContacts) {
        this.multipleContacts = multipleContacts;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
