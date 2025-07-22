import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrueAgenda {
    static Scanner scanner = new Scanner(System.in);
    static List<CONTACT> contacts = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("===agenda===");
        System.out.println("1- add contact");
        System.out.println("2- list contacts");
        System.out.println("3- search contacts");
        System.out.println("4- exit");
        boolean running = true;
        while(running){
            System.out.print("choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1 -> addContact();
                case 2 -> listContacts();
                case 3 -> searchContact();
                case 4 -> {
                    running = false;
                }
            }
        }
    }
    static class CONTACT{
        String name;
        String email;
        String number;
    }
    static void addContact(){
        CONTACT newcontact = new CONTACT();
        System.out.print("name: ");
        newcontact.name = scanner.nextLine();
        System.out.print("email: ");
        newcontact.email = scanner.nextLine();
        System.out.print("number: ");
        newcontact.number = scanner.nextLine();

        contacts.add(newcontact);
        System.out.println("new contact create");
    }
    static void listContacts(){
        for (int i = 0; i < contacts.size(); i++) {
            CONTACT c = contacts.get(i);
            System.out.println("[" + (i + 1) + "] Name: " + c.name + ", Email: " + c.email + ", Number: " + c.number);
        }
    }
    static void searchContact(){
        System.out.println("contact to search: ");
        String searchName = scanner.nextLine();
        for(CONTACT c : contacts){
            if(c.name.equalsIgnoreCase(searchName)){
                System.out.println("Found: " + c.name + ", Email: " + c.email + ", Number: " + c.number);
            }
        }
    }
}
