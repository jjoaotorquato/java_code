import java.util.Scanner;

class Contact {
    String name;
    String phone;
    String email;
}

public class agenda {
    static final int MAX_CONTACTS = 100;
    static Contact[] contacts = new Contact[MAX_CONTACTS];
    static int totalContacts = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- CONTACT AGENDA ---");
            System.out.println("1- add contact");
            System.out.println("2- list contacts");
            System.out.println("3- search contact");
            System.out.println("4- exit");
            System.out.print("choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addContact();
                case 2 -> listContacts();
                case 3 -> searchContact();
                case 4 -> {
                    System.out.println("exiting agenda...");
                    running = false;
                }
                default -> System.out.println("invalid option!");
            }
        }
    }

    static void addContact() {
        if (totalContacts >= MAX_CONTACTS) {
            System.out.println("agenda is full!");
            return;
        }

        Contact newContact = new Contact();
        System.out.print("name: ");
        newContact.name = scanner.nextLine();
        System.out.print("phone: ");
        newContact.phone = scanner.nextLine();
        System.out.print("email: ");
        newContact.email = scanner.nextLine();

        contacts[totalContacts] = newContact;
        totalContacts++;
        System.out.println("contact added successfully!");
    }

    static void listContacts() {
        if (totalContacts == 0) {
            System.out.println("no contacts registered.");
            return;
        }

        for (int i = 0; i < totalContacts; i++) {
            Contact c = contacts[i];
            System.out.println((i + 1) + ". " + c.name + " | " + c.phone + " | " + c.email);
        }
    }

    static void searchContact() {
        System.out.print("enter name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < totalContacts; i++) {
            if (contacts[i].name.equalsIgnoreCase(searchName)) {
                System.out.println("contact found:");
                System.out.println("name: " + contacts[i].name);
                System.out.println("phone: " + contacts[i].phone);
                System.out.println("email: " + contacts[i].email);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("contact not found.");
        }
    }
}
