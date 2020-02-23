package adt;

import implementation.Contacts;

public class Person {
    // a field to store the first name
    // a field to store the last name
    // a list to store multiple contact numbers (i.e a list of numbers)
    // a field to store the email address of the person

    String firstName;
    String lastName;
    public Contacts multipleContacts;
    String emailAddress;


    public Person(String firstName, String lastName, Contacts multipleContacts, String emailAddress) {
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

    public Contacts getMultipleContacts() {
        return multipleContacts;
    }

    public void setMultipleContacts(Contacts multipleContacts) {
        this.multipleContacts = multipleContacts;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
