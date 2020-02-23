package implementation;

import adt.MyListADT;
import adt.Person;
import list.MyList;

import java.util.Scanner;

public class Details<E> implements MyListADT<E> {
    MyList<Person> contact = new MyList<>();
    Scanner scan = new Scanner(System.in);
    Contacts contacts = new Contacts();

    @Override
    public void add(E item) {

        System.out.println("You have chosen to add a new contact: ");
        System.out.println("First Name: ");
        String firstName = scan.nextLine();
        System.out.println("First Name: ");
        String lastName = scan.nextLine();
        contacts.addMultipleContacts();
        String choice;
        System.out.println("Would you like to add email address? (y/n): ");
        choice = scan.nextLine();
        if (choice.equals("Y") || choice.equals("y")) {
            String emailAddress = scan.nextLine();
            contact.add(new Person(firstName, lastName, contacts, emailAddress));
        } else {
            contact.add(new Person(firstName, lastName, contacts, null));
        }
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void sort() {

    }
}
