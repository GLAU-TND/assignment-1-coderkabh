import adt.Person;
import implementation.Details;

import java.util.Scanner;

public class Main {

//    Welcome to DBC's Contact List App
//    Press 1 to add a new contact
//    Press 2 to view all contacts
//    Press 3 to search for a contact
//    Press 4 to delete a contact
//    Press 5 to exit program

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Details<Person> details = new Details<>();
        int choice = scan.nextInt();
        while (true) {
            System.out.println("Welcome to coderkabh's Contact List App");
            System.out.println("Press 1 to add a new contact");
            System.out.println("Press 2 to view all contacts");
            System.out.println("Press 3 to search for a contact");
            System.out.println("Press 4 to delete a contact");
            System.out.println("Press 5 to exit program");

            if (choice == 1) {
                details.addPerson();
                break;
            }
            if (choice == 2) {

            }
        }
    }

}
