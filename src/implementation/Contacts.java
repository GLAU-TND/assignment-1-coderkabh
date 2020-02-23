package implementation;

import adt.ContactADT;
import list.MyList;

import java.util.Scanner;

public class Contacts implements ContactADT {
    MyList<String> contacts = new MyList<>();

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    Scanner scan = new Scanner(System.in);
    String contact;


    @Override
    public void addContact() {
        do {
            this.addMultipleContacts();
            String choice;
            System.out.println("Would you like to add another contact number? (y/n): ");
            choice = scan.nextLine();
            if (choice.equals("Y") || choice.equals("y")) {
                this.addMultipleContacts();
            } else if (choice.equals("n") || choice.equals("N")) {
                break;
            } else {
                System.out.println("Enter a valid choice");
            }
        } while (true);
    }

    public void addOneContact(String contact) {
        System.out.println("Contact Number: ");
        contact = scan.nextLine();
        contacts.addOnly1Contact(contact);
    }

    @Override
    public void addMultipleContacts() {
        String contact;
        System.out.println("Contact Number: ");
        contact = scan.nextLine();
        contacts.add(contact);
    }

    @Override
    public void showContact() {
        for (int i = 0; i < contacts.size; i++) {
            if (contacts.size == 1) {
                contacts.printContactList();
            }
        }
    }

}
